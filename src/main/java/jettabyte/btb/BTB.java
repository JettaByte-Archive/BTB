package jettabyte.btb;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class BTB extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "Plugin enable!");
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "Plugin Disable!");
    }

    @EventHandler

    public void rightClickf1(PlayerInteractEvent e)

    {

        Player p = e.getPlayer();

        Action a = e.getAction();



        if(a == Action.RIGHT_CLICK_AIR) {

            if (p.getItemInHand().getType() == Material.NETHERITE_SWORD) {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }

        }else if (a == Action.RIGHT_CLICK_BLOCK)

        {

            if(p.getItemInHand().getType() == Material.NETHERITE_SWORD)

            {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }

        }else         if(a == Action.RIGHT_CLICK_AIR) {

            if (p.getItemInHand().getType() == Material.FIRE_CHARGE) {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }

        }else if (a == Action.RIGHT_CLICK_BLOCK)

        {

            if(p.getItemInHand().getType() == Material.FIRE_CHARGE)

            {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }

        }else if(a == Action.RIGHT_CLICK_AIR) {

            if (p.getItemInHand().getType() == Material.DIAMOND_SWORD) {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }

        }else if (a == Action.RIGHT_CLICK_BLOCK)

        {

            if(p.getItemInHand().getType() == Material.DIAMOND_SWORD)

            {

                Fireball fb = p.launchProjectile(Fireball.class);

                fb.setVelocity(p.getLocation().getDirection().multiply(5));

            }

        }

    }

    @EventHandler

    public void rightClick1(PlayerInteractEvent e)

    {

        Player p = e.getPlayer();

        Action a = e.getAction();



        if(a == Action.RIGHT_CLICK_AIR) {

            if (p.getItemInHand().getType() == Material.GOLD_INGOT) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 5, 40));
                p.sendTitle(" ", ChatColor.GOLD + "Super Jump!!");

            }

        }else if (a == Action.RIGHT_CLICK_BLOCK)

        {

            if (p.getItemInHand().getType() == Material.GOLD_INGOT) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 5, 40));
                p.sendTitle(" ", ChatColor.GOLD + "Super Jump!!");

            }

        }

    }
}
