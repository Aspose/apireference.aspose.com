---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "MatriceDeCouleur"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Imaging::ColorMatrix class. Représente une matrice 5x5 qui contient les coordonnées de l'espace colorimétrique RGBAW. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


Représente une matrice 5x5 qui contient les coordonnées de l'espace colorimétrique RGBAW. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class ColorMatrix : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | Construit une nouvelle instance de la classe [ColorMatrix](./) et l'initialise avec les valeurs de la matrice identité. |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | Construit une nouvelle instance de la classe [ColorMatrix](./) et l'initialise avec les valeurs spécifiées. |
| [get_Matrix00](./get_matrix00/)() const | Renvoie une valeur dans la ligne 0 et la colonne 0. |
| [get_Matrix01](./get_matrix01/)() const | Renvoie une valeur dans la ligne 0 et la colonne 1. |
| [get_Matrix02](./get_matrix02/)() const | Renvoie une valeur dans la ligne 0 et la colonne 2. |
| [get_Matrix03](./get_matrix03/)() const | Renvoie une valeur dans la ligne 0 et la colonne 3. |
| [get_Matrix04](./get_matrix04/)() const | Renvoie une valeur dans la ligne 0 et la colonne 4. |
| [get_Matrix10](./get_matrix10/)() const | Renvoie une valeur dans la ligne 1 et la colonne 0. |
| [get_Matrix11](./get_matrix11/)() const | Renvoie une valeur dans la ligne 1 et la colonne 1. |
| [get_Matrix12](./get_matrix12/)() const | Renvoie une valeur dans la ligne 1 et la colonne 2. |
| [get_Matrix13](./get_matrix13/)() const | Renvoie une valeur dans la 1ère ligne et la 3e colonne. |
| [get_Matrix14](./get_matrix14/)() const | Renvoie une valeur dans la 1ère ligne et la 4e colonne. |
| [get_Matrix20](./get_matrix20/)() const | Renvoie une valeur dans la 2e ligne et la 0e colonne. |
| [get_Matrix21](./get_matrix21/)() const | Renvoie une valeur dans la 2e ligne et la 1ère colonne. |
| [get_Matrix22](./get_matrix22/)() const | Renvoie une valeur dans la 2e ligne et la 2e colonne. |
| [get_Matrix23](./get_matrix23/)() const | Renvoie une valeur dans la 2e ligne et la 3e colonne. |
| [get_Matrix24](./get_matrix24/)() const | Renvoie une valeur dans la 2e ligne et la 4e colonne. |
| [get_Matrix30](./get_matrix30/)() const | Renvoie une valeur dans la 3e ligne et la 0e colonne. |
| [get_Matrix31](./get_matrix31/)() const | Renvoie une valeur dans la 3e ligne et la 1ère colonne. |
| [get_Matrix32](./get_matrix32/)() const | Renvoie une valeur dans la 3e ligne et la 2e colonne. |
| [get_Matrix33](./get_matrix33/)() const | Renvoie une valeur dans la 3e ligne et la 3e colonne. |
| [get_Matrix34](./get_matrix34/)() const | Renvoie une valeur dans la 3e ligne et la 4e colonne. |
| [get_Matrix40](./get_matrix40/)() const | Renvoie une valeur dans la 4e ligne et la 0e colonne. |
| [get_Matrix41](./get_matrix41/)() const | Renvoie une valeur dans la 4e ligne et la 1ère colonne. |
| [get_Matrix42](./get_matrix42/)() const | Renvoie une valeur dans la 4e ligne et la 2e colonne. |
| [get_Matrix43](./get_matrix43/)() const | Renvoie une valeur dans la 4e ligne et la 3e colonne. |
| [get_Matrix44](./get_matrix44/)() const | Renvoie une valeur dans la 4e ligne et la 4e colonne. |
| [idx_get](./idx_get/)(int, int) | Renvoie une valeur à la ligne et à la colonne spécifiées. |
| [idx_set](./idx_set/)(int, int, float) | Définit la valeur spécifiée à l'emplacement indiqué dans la matrice. |
| [set_Matrix00](./set_matrix00/)(float) | Définit une valeur dans la 0e ligne et la 0e colonne. |
| [set_Matrix01](./set_matrix01/)(float) | Définit une valeur dans la 0e ligne et la 1ère colonne. |
| [set_Matrix02](./set_matrix02/)(float) | Définit une valeur dans la 0e ligne et la 2e colonne. |
| [set_Matrix03](./set_matrix03/)(float) | Définit une valeur dans la 0e ligne et la 3e colonne. |
| [set_Matrix04](./set_matrix04/)(float) | Définit une valeur dans la 0e ligne et la 4e colonne. |
| [set_Matrix10](./set_matrix10/)(float) | Définit une valeur dans la 1ère ligne et la 0e colonne. |
| [set_Matrix11](./set_matrix11/)(float) | Définit une valeur dans la 1ère ligne et la 1ère colonne. |
| [set_Matrix12](./set_matrix12/)(float) | Définit une valeur dans la 1ère ligne et la 2ème colonne. |
| [set_Matrix13](./set_matrix13/)(float) | Définit une valeur dans la 1ère ligne et la 3ème colonne. |
| [set_Matrix14](./set_matrix14/)(float) | Définit une valeur dans la 1ère ligne et la 4ème colonne. |
| [set_Matrix20](./set_matrix20/)(float) | Définit une valeur dans la 2ème ligne et la 0ème colonne. |
| [set_Matrix21](./set_matrix21/)(float) | Définit une valeur dans la 2ème ligne et la 1ère colonne. |
| [set_Matrix22](./set_matrix22/)(float) | Définit une valeur dans la 2ème ligne et la 2ème colonne. |
| [set_Matrix23](./set_matrix23/)(float) | Définit une valeur dans la 2ème ligne et la 3ème colonne. |
| [set_Matrix24](./set_matrix24/)(float) | Définit une valeur dans la 2ème ligne et la 4ème colonne. |
| [set_Matrix30](./set_matrix30/)(float) | Définit une valeur dans la 3ème ligne et la 0ème colonne. |
| [set_Matrix31](./set_matrix31/)(float) | Définit une valeur dans la 3ème ligne et la 1ère colonne. |
| [set_Matrix32](./set_matrix32/)(float) | Définit une valeur dans la 3ème ligne et la 2ème colonne. |
| [set_Matrix33](./set_matrix33/)(float) | Définit une valeur dans la 3ème ligne et la 3ème colonne. |
| [set_Matrix34](./set_matrix34/)(float) | Définit une valeur dans la 3ème ligne et la 4ème colonne. |
| [set_Matrix40](./set_matrix40/)(float) | Définit une valeur dans la 4ème ligne et la 0ème colonne. |
| [set_Matrix41](./set_matrix41/)(float) | Définit une valeur dans la 4ème ligne et la 1ère colonne. |
| [set_Matrix42](./set_matrix42/)(float) | Définit une valeur dans la 4ème ligne et la 2ème colonne. |
| [set_Matrix43](./set_matrix43/)(float) | Définit une valeur dans la 4ème ligne et la 3ème colonne. |
| [set_Matrix44](./set_matrix44/)(float) | Définit une valeur dans la 4ème ligne et la 4ème colonne. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
