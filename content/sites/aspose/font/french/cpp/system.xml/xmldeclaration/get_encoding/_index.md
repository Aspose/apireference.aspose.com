---
title: "System::Xml::XmlDeclaration::get_Encoding méthode"
linktitle: "obtenir_Encodage"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlDeclaration::get_Encoding méthode. Retourne le niveau d’encodage du document XML en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


Retourne le niveau d'encodage du document XML.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

Le nom d’encodage de caractères valide.
## Remarques



Les noms d’encodage de caractères les plus couramment pris en charge pour XML sont les suivants : |||
|-|-|
| Catégorie | Noms d’encodage |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (où "n" est un chiffre de 1 à 9) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

Cette valeur est facultative. Si aucune valeur n'est définie, cette méthode renvoie [String::Empty](../../../system/string/empty/). Si aucun attribut d'encodage n'est inclus, l'encodage UTF-8 est supposé lorsque le document est écrit ou enregistré.
## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
