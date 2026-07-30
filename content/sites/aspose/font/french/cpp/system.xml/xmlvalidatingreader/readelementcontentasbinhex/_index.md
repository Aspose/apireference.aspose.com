---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex méthode"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex méthode. Lit l'élément et décode le contenu BinHex en C++."
type: docs
weight: 4400
url: /fr/cpp/system.xml/xmlvalidatingreader/readelementcontentasbinhex/
---
## XmlValidatingReader::ReadElementContentAsBinHex method


Lit l'élément et décode le contenu BinHex.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
