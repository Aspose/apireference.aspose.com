---
title: "System::Xml::XmlReader::ReadContentAsBinHex méthode"
linktitle: "LireContenuEnBinHex"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReader::ReadContentAsBinHex méthode. Lit le contenu et renvoie les octets binaires décodés en BinHex en C++."
type: docs
weight: 4100
url: /fr/cpp/system.xml/xmlreader/readcontentasbinhex/
---
## XmlReader::ReadContentAsBinHex method


Lit le contenu et renvoie les octets binaires décodés **BinHex**.

```cpp
virtual int32_t System::Xml::XmlReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<uint8_t\> | Le tampon dans lequel copier le texte résultant. Cette valeur ne peut pas être **nullptr**. |
| indice | int32_t | Le décalage dans le tampon où commencer à copier le résultat. |
| count | int32_t | Le nombre maximal d'octets à copier dans le tampon. Le nombre réel d'octets copiés est renvoyé par cette méthode. |

### ReturnValue

Le nombre d'octets écrits dans le tampon.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
