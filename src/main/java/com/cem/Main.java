package com.cem;

import com.cem.entity.Brans;
import com.cem.entity.Doktor;
import com.cem.entity.Hasta;
import com.cem.entity.Randevu;
import com.cem.repository.BransRepository;
import com.cem.repository.DoktorRepository;
import com.cem.repository.HastaRepository;
import com.cem.repository.RandevuRepository;
import com.cem.service.HastaServis;
import com.cem.utils.DemoImpl;
import com.cem.utils.RandevuManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        // TODO : HOCAM 100 RANDEVU YARATMAKLA UGRASAMAM DIYE KURUCU METODU KESFETTIM AMA
        // TODO : SIZIN BU REPOSITORY MANAGER BENI BITIRDI.

        // TODO : ALDIGIM HATALAR

        // TODO : LAZY INITIALIZATION (REPOSITORYLERI 2. kez hasta servis'te kullandigimdan)
        // TODO : STACKOVERFLOW (String metodlari birbirini cagirdigi icin)
        // TODO : ILLEGAL STATE (bunu hatirlamiyorum)
        // TODO : Out of ram gibi bir sey (programa ram yetmiyormus. kapatip actim)
        // TODO : :app:clean gibi bir sey. build teki dosyalari silemiyormus. dosyayi secip delete yaptim. (1 saatimi aldi bulmam)

        DemoImpl.dataOlustur();

        HastaServis hastaServis = new HastaServis();
        hastaServis.hastaBilgisi("Ali");




    }
}