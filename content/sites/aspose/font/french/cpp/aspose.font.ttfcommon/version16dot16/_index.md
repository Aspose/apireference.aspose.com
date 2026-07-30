---
title: "Aspose::Font::TtfCommon::Version16Dot16 classe"
linktitle: "Version16Dot16"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfCommon::Version16Dot16 classe. Représente le type de données Version16Dot16 en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class


Représente le type de données [Version16Dot16](./).

```cpp
class Version16Dot16 : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Créez une copie de l'objet [Version16Dot16](./). |
| [get_MajorNumber](./get_majornumber/)() const | Obtient le numéro de version majeur. La valeur n'a de sens qu'en notation hexadécimale, par exemple la version 0,5 pour 'maxp' dans les fichiers de police réels est de 4 octets : {0, 0, 80, 0}, ce qui a la représentation hexadécimale 0x00005000. Après avoir lu cette version du fichier de police, les numéros majeur et mineur pour l'objet [Version16Dot16](./) seront respectivement 0 et 20480. Et ces valeurs sous forme hexadécimale sont 0x0000 et 0x5000. |
| [get_MinorNumber](./get_minornumber/)() const | Obtient le numéro de version mineur. La valeur n'a de sens qu'en notation hexadécimale, par exemple la version 0,5 pour 'maxp' dans les fichiers de police réels est de 4 octets : {0, 0, 80, 0}, ce qui a la représentation hexadécimale 0x00005000. Après avoir lu cette version du fichier de police, les numéros majeur et mineur pour l'objet [Version16Dot16](./) seront respectivement 0 et 20480. Et ces valeurs sous forme hexadécimale sont 0x0000 et 0x5000. |
| [get_RawBytes](./get_rawbytes/)() | Obtient tous les bits bruts du numéro de version [Version16Dot16](./) sous forme de tableau d'octets de taille 4 octets. |
| [set_MajorNumber](./set_majornumber/)(uint16_t) | Définit le numéro de version majeur. La valeur n'a de sens qu'en notation hexadécimale, par exemple la version 0,5 pour 'maxp' dans les fichiers de police réels est de 4 octets : {0, 0, 80, 0}, ce qui a la représentation hexadécimale 0x00005000. Après avoir lu cette version du fichier de police, les numéros majeur et mineur pour l'objet [Version16Dot16](./) seront respectivement 0 et 20480. Et ces valeurs sous forme hexadécimale sont 0x0000 et 0x5000. |
| [set_MinorNumber](./set_minornumber/)(uint16_t) | Définit le numéro de version mineur. La valeur n'a de sens qu'en notation hexadécimale, par exemple la version 0,5 pour 'maxp' dans les fichiers de police réels est de 4 octets : {0, 0, 80, 0}, ce qui a la représentation hexadécimale 0x00005000. Après avoir lu cette version du fichier de police, les numéros majeur et mineur pour l'objet [Version16Dot16](./) seront respectivement 0 et 20480. Et ces valeurs sous forme hexadécimale sont 0x0000 et 0x5000. |
| [ToString](./tostring/)() const override | Renvoie la valeur de version sous forme de chaîne formatée. Par exemple "0.5", "1.1", "3.0", etc. |
| [Version16Dot16](./version16dot16/)() | Constructeur. |
| [Version16Dot16](./version16dot16/)(uint16_t, uint16_t) | Constructeur. |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::TtfCommon](../)
* Library [Aspose.Font for C++](../../)
