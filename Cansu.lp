\ LP format - for model browsing. Use MPS format to capture full model detail.
Maximize
  13 Pilav_E1 + 12 Pilav_E7 + 11 Pilav_E3 + 5 Mantı_E0 + 8 Künefe_E1
   + 8 Pizza_E1 + 7 Künefe_E4 + 13 Hambuger_E0 + 14 Salata_E0
   + 11 Mantı_E5 + 12 Künefe_E5 + 10 Salata_E0 + 11 Salata_E3
   + 9 Pilav_E1 + 14 Pilav_E0 + 12 Lahmacun_E9 + 6 Pizza_E4 + 5 Lahmacun_E6
   + 5 Mantı_E1 + 9 Mercimek_E6
Subject To
 _Money_Constraint: 13 Pilav_E1 + 7 Pilav_E7 + 13 Pilav_E3 + 9 Mantı_E0
   + 10 Künefe_E1 + 13 Pizza_E1 + 7 Künefe_E4 + 13 Hambuger_E0
   + 14 Salata_E0 + 11 Mantı_E5 + 10 Künefe_E5 + 14 Salata_E0
   + 13 Salata_E3 + 6 Pilav_E1 + 9 Pilav_E0 + 13 Lahmacun_E9 + 10 Pizza_E4
   + 13 Lahmacun_E6 + 10 Mantı_E1 + 10 Mercimek_E6 <= 80
 _Food_Capacity_Constraint: 5 Pilav_E1 + 5 Pilav_E7 + 13 Pilav_E3
   + 12 Mantı_E0 + 6 Künefe_E1 + 14 Pizza_E1 + 11 Künefe_E4
   + 7 Hambuger_E0 + 14 Salata_E0 + 12 Mantı_E5 + 10 Künefe_E5
   + 6 Salata_E0 + 6 Salata_E3 + 9 Pilav_E1 + 7 Pilav_E0 + 6 Lahmacun_E9
   + 14 Pizza_E4 + 9 Lahmacun_E6 + 14 Mantı_E1 + 11 Mercimek_E6 <= 70
Bounds
Binaries
 Pilav_E1 Pilav_E7 Pilav_E3 Mantı_E0 Künefe_E1 Pizza_E1 Künefe_E4
 Hambuger_E0 Salata_E0 Mantı_E5 Künefe_E5 Salata_E0 Salata_E3 Pilav_E1
 Pilav_E0 Lahmacun_E9 Pizza_E4 Lahmacun_E6 Mantı_E1 Mercimek_E6
End
