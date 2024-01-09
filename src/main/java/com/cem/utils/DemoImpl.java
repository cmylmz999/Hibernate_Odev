package com.cem.utils;

import com.cem.entity.Brans;
import com.cem.entity.Doktor;
import com.cem.entity.Hasta;
import com.cem.entity.Randevu;
import com.cem.repository.BransRepository;
import com.cem.repository.DoktorRepository;
import com.cem.repository.HastaRepository;
import com.cem.repository.RandevuRepository;

public class DemoImpl {
    public static DoktorRepository doktorRepository = new DoktorRepository();
    public static HastaRepository hastaRepository = new HastaRepository();
    public static RandevuRepository randevuRepository = new RandevuRepository();
    public static BransRepository bransRepository = new BransRepository();
    public static void dataOlustur() {

        Brans.instances.clear();
        Doktor.instances.clear();
        Randevu.instances.clear();
        Hasta.instances.clear();

        Brans brans1 = Brans.builder().bransAdi("Dermatoloji").build();
        Brans brans2 = Brans.builder().bransAdi("Ortopedi").build();
        Brans brans3 = Brans.builder().bransAdi("Dahiliye").build();
        Brans brans4 = Brans.builder().bransAdi("Kulak Burun Boğaz").build();
        Brans brans5 = Brans.builder().bransAdi("Cildiye").build();

        Doktor doktor1 = Doktor.builder().doktorAdi("Mehmet").build();
        Doktor doktor2 = Doktor.builder().doktorAdi("Ayşe").build();
        Doktor doktor3 = Doktor.builder().doktorAdi("Mustafa").build();
        Doktor doktor4 = Doktor.builder().doktorAdi("Zeynep").build();
        Doktor doktor5 = Doktor.builder().doktorAdi("Emre").build();

        Hasta hasta1 = Hasta.builder().hastaAdi("Ali").hastaSoyadi("Demir").build();
        Hasta hasta2 = Hasta.builder().hastaAdi("Ayşe").hastaSoyadi("Kaya").build();
        Hasta hasta3 = Hasta.builder().hastaAdi("Mehmet").hastaSoyadi("Çelik").build();
        Hasta hasta4 = Hasta.builder().hastaAdi("Zeynep").hastaSoyadi("Yıldız").build();
        Hasta hasta5 = Hasta.builder().hastaAdi("Emre").hastaSoyadi("Koç").build();
        Hasta hasta6 = Hasta.builder().hastaAdi("Fatma").hastaSoyadi("Turan").build();
        Hasta hasta7 = Hasta.builder().hastaAdi("Ahmet").hastaSoyadi("Şahin").build();
        Hasta hasta8 = Hasta.builder().hastaAdi("Selin").hastaSoyadi("Cengiz").build();
        Hasta hasta9 = Hasta.builder().hastaAdi("Onur").hastaSoyadi("Yılmaz").build();
        Hasta hasta10 = Hasta.builder().hastaAdi("Buse").hastaSoyadi("Doğan").build();
        Hasta hasta11 = Hasta.builder().hastaAdi("Burak").hastaSoyadi("Kara").build();
        Hasta hasta12 = Hasta.builder().hastaAdi("Deniz").hastaSoyadi("Arslan").build();
        Hasta hasta13 = Hasta.builder().hastaAdi("Elif").hastaSoyadi("Çetin").build();
        Hasta hasta14 = Hasta.builder().hastaAdi("Eren").hastaSoyadi("Bulut").build();
        Hasta hasta15 = Hasta.builder().hastaAdi("Gizem").hastaSoyadi("Şimşek").build();
        Hasta hasta16 = Hasta.builder().hastaAdi("Hakan").hastaSoyadi("Güler").build();
        Hasta hasta17 = Hasta.builder().hastaAdi("İlayda").hastaSoyadi("Kurt").build();
        Hasta hasta18 = Hasta.builder().hastaAdi("Kerem").hastaSoyadi("Erdem").build();
        Hasta hasta19 = Hasta.builder().hastaAdi("Melis").hastaSoyadi("Erdoğan").build();
        Hasta hasta20 = Hasta.builder().hastaAdi("Ozan").hastaSoyadi("Taş").build();

        bransRepository.saveAll(Brans.instances);

        doktor1.setBrans(brans3);
        doktor2.setBrans(brans1);
        doktor3.setBrans(brans2);
        doktor4.setBrans(brans4);
        doktor5.setBrans(brans5);

        doktorRepository.saveAll(Doktor.instances);
        hastaRepository.saveAll(Hasta.instances);

        RandevuManager.RandevuYarat();

        randevuRepository.saveAll(Randevu.instances);

        Brans.instances.clear();
        Doktor.instances.clear();
        Randevu.instances.clear();
        Hasta.instances.clear();
    }
}
