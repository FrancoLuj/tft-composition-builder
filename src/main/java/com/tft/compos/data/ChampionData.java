/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tft.compos.data;
import com.tft.compos.model.Champion;
import com.tft.compos.model.Trait;
import java.util.*;

/**
 *
 * @author Franco
 */
public class ChampionData {
    
    //CAMPEONES COSTE 1    
    public static final Champion anivia = new Champion("Anivia", List.of(TraitData.freljord,TraitData.invoker),1);
    public static final Champion blitzcrank = new Champion("Blitzcrank", List.of(TraitData.zaun,TraitData.juggernaut), 1);
    public static final Champion briar = new Champion("Briar", List.of(TraitData.noxus,TraitData.slayer,TraitData.juggernaut), 1);
    public static final Champion caitlyn = new Champion("Caitlyn", List.of(TraitData.piltover,TraitData.longshot), 1);
    public static final Champion illaoi = new Champion("Illaoi", List.of(TraitData.bilgeWater,TraitData.bruiser), 1);
    public static final Champion jarvanIV =new Champion("Jarvan IV", List.of(TraitData.demacia,TraitData.defender), 1);
    public static final Champion jhin = new Champion("Jhin", List.of(TraitData.ionia,TraitData.gunslinger), 1);
    public static final Champion kogmaw = new Champion("Kog'Maw", List.of(TraitData.voids,TraitData.arcanist,TraitData.longshot), 1);
    public static final Champion lulu = new Champion("Lulu", List.of(TraitData.yordle,TraitData.arcanist), 1);
    public static final Champion qiyana = new Champion("Qiyana", List.of(TraitData.ixtal,TraitData.slayer), 1);
    public static final Champion rumble = new Champion("Rumble", List.of(TraitData.yordle,TraitData.defender), 1);
    public static final Champion shen = new Champion("Shen", List.of(TraitData.ionia,TraitData.bruiser), 1);
    public static final Champion sona = new Champion("Sona", List.of(TraitData.demacia,TraitData.invoker), 1);
    public static final Champion viego = new Champion("Viego", List.of(TraitData.shadowIsles,TraitData.quickstriker), 1);
    
    //CAMPEONES COSTE 2
    public static final Champion aphelios = new Champion("Aphelios", List.of(TraitData.targon), 2);
    public static final Champion ashe = new Champion("Ashe", List.of(TraitData.freljord,TraitData.quickstriker), 2);
    public static final Champion bardo = new Champion("Bardo", List.of(TraitData.caretaker), 2);
    public static final Champion chogath = new Champion("Chogath", List.of(TraitData.voids,TraitData.juggernaut), 2);
    public static final Champion ekko = new Champion("Ekko", List.of(TraitData.zaun,TraitData.disruptor), 2);
    public static final Champion graves = new Champion("Graves", List.of(TraitData.bilgeWater,TraitData.gunslinger), 2);
    public static final Champion neeko = new Champion("Neeko", List.of(TraitData.ixtal,TraitData.arcanist,TraitData.defender), 2);
    public static final Champion orianna = new Champion("Orianna", List.of(TraitData.piltover,TraitData.invoker), 2);
    public static final Champion poppy = new Champion("Poppy", List.of(TraitData.demacia,TraitData.yordle,TraitData.defender), 2);
    public static final Champion reksai = new Champion("RekSai", List.of(TraitData.voids,TraitData.vanquisher), 2);
    public static final Champion sion = new Champion("Sion", List.of(TraitData.noxus,TraitData.bruiser), 2);
    public static final Champion teemo = new Champion("Teemo", List.of(TraitData.yordle,TraitData.longshot), 2);
    public static final Champion tristana = new Champion("Tristana", List.of(TraitData.yordle,TraitData.gunslinger), 2);
    public static final Champion tryndamere = new Champion("Tryndamere", List.of(TraitData.freljord,TraitData.slayer), 2);
    public static final Champion twistedFate = new Champion("Twisted Fate", List.of(TraitData.bilgeWater,TraitData.quickstriker), 2);
    public static final Champion vi = new Champion("Vi", List.of(TraitData.piltover,TraitData.zaun,TraitData.defender), 2);
    public static final Champion xinZhao = new Champion("Xin Zhao", List.of(TraitData.demacia,TraitData.ionia,TraitData.warden), 2);
    public static final Champion yasuo = new Champion("Yasuo", List.of(TraitData.ionia,TraitData.slayer), 2);
    public static final Champion yorick = new Champion("Yorick", List.of(TraitData.shadowIsles,TraitData.warden), 2);
    
    //CAMPEONES COSTE 3
    public static final Champion ahri = new Champion("Ahri", List.of(TraitData.ionia,TraitData.arcanist), 3);
    public static final Champion darius = new Champion("Darius", List.of(TraitData.noxus,TraitData.bruiser), 3);
    public static final Champion drMundo = new Champion("Dr Mundo", List.of(TraitData.zaun,TraitData.bruiser), 3);
    public static final Champion draven = new Champion("Draven", List.of(TraitData.noxus,TraitData.quickstriker), 3);
    public static final Champion gangplank = new Champion("Gangplank", List.of(TraitData.bilgeWater,TraitData.slayer,TraitData.vanquisher), 3);
    public static final Champion gwen = new Champion("Gwen", List.of(TraitData.shadowIsles,TraitData.slayer), 3);
    public static final Champion jinx = new Champion("Jinx", List.of(TraitData.zaun,TraitData.gunslinger), 3);
    public static final Champion kennen = new Champion("Kennen", List.of(TraitData.ionia,TraitData.yordle,TraitData.defender), 3);
    public static final Champion kobukoYuumi = new Champion("Kobuko y Yuumi", List.of(TraitData.yordle,TraitData.bruiser,TraitData.invoker), 3);
    public static final Champion leblanc = new Champion("LeBlanc", List.of(TraitData.noxus,TraitData.invoker), 3);
    public static final Champion leona = new Champion("Leona", List.of(TraitData.targon), 3);
    public static final Champion loris = new Champion("Loris", List.of(TraitData.piltover,TraitData.warden), 3);
    public static final Champion malzahar = new Champion("Malzahar", List.of(TraitData.voids,TraitData.disruptor), 3);
    public static final Champion millio = new Champion("Millio", List.of(TraitData.ixtal,TraitData.invoker), 3);
    public static final Champion nautilus =new Champion("Nautilus", List.of(TraitData.bilgeWater,TraitData.juggernaut,TraitData.warden), 3);
    public static final Champion sejuani = new Champion("Sejuani", List.of(TraitData.freljord,TraitData.defender), 3);
    public static final Champion vayne = new Champion("Vayne", List.of(TraitData.demacia,TraitData.longshot), 3);
    public static final Champion zoe = new Champion("Zoe", List.of(TraitData.targon), 3);
    
    //CAMPEONES COSTE 4
    public static final Champion ambessa = new Champion("Ambessa", List.of(TraitData.noxus,TraitData.vanquisher), 4);
    public static final Champion belVeth = new Champion("BelVeth", List.of(TraitData.voids,TraitData.slayer), 4);
    public static final Champion braum = new Champion("Braum", List.of(TraitData.freljord,TraitData.warden), 4);
    public static final Champion diana = new Champion("Diana", List.of(TraitData.targon), 4);
    public static final Champion fizz = new Champion("Fizz", List.of(TraitData.bilgeWater,TraitData.yordle), 4);
    public static final Champion garen = new Champion("Garen", List.of(TraitData.demacia,TraitData.defender), 4);
    public static final Champion heraldo = new Champion("Heraldo de la grieta", List.of(TraitData.voids,TraitData.bruiser), 4);
    public static final Champion kaisa = new Champion("KaiSa", List.of(TraitData.assimilator,TraitData.voids,TraitData.longshot), 4);
    public static final Champion kalista = new Champion("Kalista", List.of(TraitData.shadowIsles,TraitData.vanquisher), 4);
    public static final Champion lissandra = new Champion("Lissandra", List.of(TraitData.freljord,TraitData.invoker), 4);
    public static final Champion lux = new Champion("Lux", List.of(TraitData.demacia,TraitData.arcanist), 4);
    public static final Champion missFortune = new Champion("Miss Fortune", List.of(TraitData.bilgeWater,TraitData.gunslinger), 4);
    public static final Champion nasus = new Champion("Nasus", List.of(TraitData.shurima), 4);
    public static final Champion nidalee = new Champion("Nidalee", List.of(TraitData.ixtal,TraitData.huntress), 4);
    public static final Champion renekton = new Champion("Renekton", List.of(TraitData.shurima), 4);
    public static final Champion seraphine = new Champion("Seraphine", List.of(TraitData.piltover,TraitData.disruptor), 4);
    public static final Champion singed = new Champion("Singed", List.of(TraitData.zaun,TraitData.juggernaut), 4);
    public static final Champion skarner = new Champion("Skarner", List.of(TraitData.ixtal), 4);
    public static final Champion swain = new Champion("Swain", List.of(TraitData.noxus,TraitData.arcanist,TraitData.juggernaut), 4);
    public static final Champion taric= new Champion("Taric", List.of(TraitData.targon), 4);
    public static final Champion veigar = new Champion("Veigar", List.of(TraitData.yordle,TraitData.arcanist), 4);
    public static final Champion warwick = new Champion("Warwick", List.of(TraitData.zaun,TraitData.quickstriker), 4);
    public static final Champion wukong = new Champion("Wukong", List.of(TraitData.ionia,TraitData.bruiser), 4);
    public static final Champion yone = new Champion("Yone", List.of(TraitData.ionia,TraitData.slayer), 4);
    public static final Champion yunara = new Champion("Yunara", List.of(TraitData.ionia,TraitData.quickstriker), 4);
    
    
    //CAMPEONES COSTE 5
    public static final Champion aatrox = new Champion("Aatrox", List.of(TraitData.darkin,TraitData.worldEnder,TraitData.slayer),5);
    public static final Champion annie = new Champion("Annie", List.of(TraitData.darkChild,TraitData.arcanist), 5);
    public static final Champion azir = new Champion("Azir", List.of(TraitData.shurima,TraitData.emperor, TraitData.disruptor), 5);
    public static final Champion fiddlesticks = new Champion("Fiddlesticks", List.of(TraitData.harvester,TraitData.vanquisher), 5);
    public static final Champion galio = new Champion("Galio", List.of(TraitData.demacia,TraitData.heroic), 5);
    public static final Champion kindred = new Champion("Kindred", List.of(TraitData.eternal,TraitData.quickstriker), 5);
    public static final Champion lucianSenna = new Champion("Lucian y Senna", List.of(TraitData.soulbound,TraitData.gunslinger), 5);
    public static final Champion mel = new Champion("Mel", List.of(TraitData.noxus,TraitData.disruptor), 5);
    public static final Champion ornn = new Champion("Ornn", List.of(TraitData.blackSmith,TraitData.warden), 5);
    public static final Champion sett = new Champion("Sett", List.of(TraitData.ionia,TraitData.theBoss),5);
    public static final Champion shyvana = new Champion("Shyvana", List.of(TraitData.dragonborn,TraitData.juggernaut), 5);
    public static final Champion tHex = new Champion("THex", List.of(TraitData.hexMech,TraitData.piltover,TraitData.gunslinger), 5);
    public static final Champion tahmKench = new Champion("Tahm Kench", List.of(TraitData.bilgeWater,TraitData.glutton,TraitData.bruiser), 5);
    public static final Champion thresh = new Champion("Thresh", List.of(TraitData.shadowIsles,TraitData.warden), 5);
    public static final Champion volibear = new Champion("Volibear", List.of(TraitData.freljord,TraitData.bruiser), 5);
    public static final Champion xerath = new Champion("Xerath", List.of(TraitData.shurima,TraitData.ascendant), 5);
    public static final Champion ziggs = new Champion("Ziggs", List.of(TraitData.zaun,TraitData.yordle,TraitData.longshot), 5);
    public static final Champion zilean = new Champion("Zilean", List.of(TraitData.chronokeeper, TraitData.invoker), 5);
    
    //CAMPEONES COSTE 7
    public static final Champion aurelionSol = new Champion("Aurelion Sol", List.of(TraitData.starForger,TraitData.targon), 7);
    public static final Champion baronNashor = new Champion("Baron Nashor", List.of(TraitData.voids,TraitData.riftcourge), 7) ;
    public static final Champion brock = new Champion("Brock", List.of(TraitData.ixtal), 7) ;
    public static final Champion ryze = new Champion("Ryze", List.of(TraitData.runeMage), 7);
    public static final Champion sylas = new Champion("Sylas", List.of(TraitData.chainbreaker,TraitData.demacia,TraitData.defender), 7) ;
    public static final Champion zaahen = new Champion("Zaahen", List.of(TraitData.darkin,TraitData.immortal), 7);
    
    
    //CAMPEONES COSTE 11
    public static final Champion tibbers = new Champion("Tibbers", List.of(TraitData.arcanist), 11) ;
    
    //Metodos
    
    //Ver todos los campeones
    public static List<Champion> getAllChampions(){
        return List.of(anivia,blitzcrank,briar,caitlyn,illaoi,jarvanIV,jhin,kogmaw,lulu,qiyana,rumble,shen,sona,viego,aphelios,ashe,bardo,chogath,ekko,graves,neeko,orianna,poppy,reksai,sion,teemo,tristana,tryndamere,twistedFate,vi,xinZhao,yasuo,yorick,ahri,darius,drMundo,draven,gangplank,gwen,jinx,kennen,kobukoYuumi,leblanc,leona,loris,malzahar,millio,nautilus,sejuani,vayne,zoe,ambessa,belVeth,braum,diana,fizz,garen,heraldo,kaisa,kalista,lissandra,lux,missFortune,nasus,nidalee,renekton,seraphine,singed,skarner,swain,taric,veigar,warwick,wukong,yone,yunara,aatrox,annie,azir,fiddlesticks,galio,kindred,lucianSenna,mel,ornn,sett,shyvana,tHex,tahmKench,thresh,volibear,xerath,ziggs,zilean,aurelionSol,baronNashor,brock,ryze,sylas,zaahen,tibbers);
    }
    
    //Encontrar un campeon por nombre (por si no existe o ingresa mal el usuario)
    public static Champion findByName(String name){
        for(Champion elem:getAllChampions()){
            if(elem.getName().equalsIgnoreCase(name)) return elem; //ignoro mayus o minus
        }
        return null; //si no encontro el nombre retorno null
    }
    
    

 
}
