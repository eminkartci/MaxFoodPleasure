\ LP format - for model browsing. Use MPS format to capture full model detail.
Maximize
  9 Mantı_E2 + 7 Pizza_E8 + 9 Hambuger_E3 + 11 Pilav_E5 + 10 Lahmacun_E0
   + 6 Mantı_E1 + 5 Tatlı_E4 + 13 Tatlı_E8 + 9 Künefe_E7
   + 10 Mercimek_E4 + 14 Salata_E2 + 12 Hambuger_E8 + 9 Pilav_E6
   + 6 Kebap_E0 + 14 Pizza_E5 + 12 Mantı_E4 + 8 Künefe_E4 + 6 Künefe_E4
   + 11 Antrikot_E1 + 13 Kebap_E2
Subject To
 _Money_Constraint: 11 Mantı_E2 + 14 Pizza_E8 + 5 Hambuger_E3 + 5 Pilav_E5
   + 10 Lahmacun_E0 + 6 Mantı_E1 + 13 Tatlı_E4 + 10 Tatlı_E8
   + 5 Künefe_E7 + 12 Mercimek_E4 + 5 Salata_E2 + 11 Hambuger_E8
   + 14 Pilav_E6 + 8 Kebap_E0 + 14 Pizza_E5 + 11 Mantı_E4 + 12 Künefe_E4
   + 11 Künefe_E4 + 14 Antrikot_E1 + 9 Kebap_E2 <= 120
 _Food_Capacity_Constraint: 9 Mantı_E2 + 5 Pizza_E8 + 8 Hambuger_E3
   + 6 Pilav_E5 + 14 Lahmacun_E0 + 14 Mantı_E1 + 14 Tatlı_E4
   + 13 Tatlı_E8 + 13 Künefe_E7 + 7 Mercimek_E4 + 10 Salata_E2
   + 13 Hambuger_E8 + 5 Pilav_E6 + 9 Kebap_E0 + 11 Pizza_E5 + 12 Mantı_E4
   + 9 Künefe_E4 + 12 Künefe_E4 + 12 Antrikot_E1 + 11 Kebap_E2 <= 78
Bounds
Binaries
 Mantı_E2 Pizza_E8 Hambuger_E3 Pilav_E5 Lahmacun_E0 Mantı_E1 Tatlı_E4
 Tatlı_E8 Künefe_E7 Mercimek_E4 Salata_E2 Hambuger_E8 Pilav_E6 Kebap_E0
 Pizza_E5 Mantı_E4 Künefe_E4 Künefe_E4 Antrikot_E1 Kebap_E2
End
