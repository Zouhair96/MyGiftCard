package org.gift.web;


import org.gift.entity.AppUser;
import org.gift.entity.Carte;
import org.gift.entity.Commande;
import org.gift.entity.LigneCommande;
import org.gift.repository.AppUserRepository;
import org.gift.repository.CarteRepository;
import org.gift.repository.CommandeRepository;
import org.gift.repository.LigneCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import lombok.var;



@CrossOrigin("*")
@RestController
public class CommandeController {
    @Autowired
    private CarteRepository carteRepository;
    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private LigneCommandeRepository ligneCommandeRepository;
    @PostMapping("/commandes/new")
    public Commande saveCommande(@RequestBody CommandeForm commandeForm){
        AppUser appUser=new AppUser();
        /*appUser.setName(commandeForm.getAppUser().getName());
        appUser.setEmail(commandeForm.getAppUser().getEmail());
        appUser.setAddress(commandeForm.getAppUser().getAddress());
        appUser.setPhoneNumber(commandeForm.getAppUser().getPhoneNumber());
        appUser.setUsername(commandeForm.getAppUser().getUsername());*/
        appUser=appUserRepository.save(appUser);
        System.out.println(appUser.getId());

        Commande commande=new Commande();
        commande.setUser(appUser);
       // commande.setDate(new Date());
        commande=commandeRepository.save(commande);
        //double total=0;
        for(CommandeCartes c:commandeForm.getCartes()){
            LigneCommande ligneCommande=new LigneCommande();
            ligneCommande.setCommande(commande);
            Carte carte=carteRepository.findById(c.getId()).get();
            ligneCommande.setCarte(carte);
            //ligneCommande.setPrix(carte.getPrix());
            //ligneCommande.setQuantity(c.getQuantity());
            ligneCommandeRepository.save(ligneCommande);
            //total+=c.getQuantity()*product.getPrix();
        }
        //commande.setTotalAmount(total);
        return commandeRepository.save(commande);
    }/*
    @PostMapping("/new")
    public Commande saveCommande(@RequestBody Commande saveCommande  ){
    
       //  var userId = req.body.userId;
      //  let data = JSON.parse(req.body);
        var userId, cartes = saveCommande.body;
       

         if (userId != null && userId > 0) {
        	 commandeRepository.save(saveCommande);

                if (CommandeId > 0) {
                    cartes.forEach(async (p) => {

                            var data = await database.table('carte').filter({id: p.id}).withFields(['quantity']).get();



                        let inCart = parseInt(p.incart);

                        // Deduct the number of pieces ordered from the quantity in database

                        if (data.quantity > 0) {
                            data.quantity = data.quantity - inCart;

                            if (data.quantity < 0) {
                                data.quantity = 0;
                            }

                        } else {
                            data.quantity = 0;
                        }

                        // Insert order details w.r.t the newly created order Id
                        database.table('orders_details')
                            .insert({
                                order_id: newOrderId,
                                product_id: p.id,
                                quantity: inCart
                            }).then(newId => {
                            database.table('products')
                                .filter({id: p.id})
                                .update({
                                    quantity: data.quantity
                                }).then(successNum => {
                            }).catch(err => console.log(err));
                        }).catch(err => console.log(err));
                    });

                } else {
                    res.json({message: 'New order failed while adding order details', success: false});
                }
                res.json({
                    message: `Order successfully placed with order id ${newOrderId}`,
                    success: true,
                    order_id: newOrderId,
                    products: products
                })
            }).catch(err => res.json(err));
        }

        else {
            res.json({message: 'New order failed', success: false});
        }

    });*/

}
