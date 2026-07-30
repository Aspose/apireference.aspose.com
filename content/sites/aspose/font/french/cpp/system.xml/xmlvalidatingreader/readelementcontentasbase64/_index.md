---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBase64 méthode"
linktitle: "LireContenuÉlémentEnBase64"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBase64 method. Lit l'élément et décodera le contenu Base64 en C++."
type: docs
weight: 4300
url: /fr/cpp/system.xml/xmlvalidatingreader/readelementcontentasbase64/
---
## XmlValidatingReader::ReadElementContentAsBase64 method


Lit l'élément et décode le contenu Base64.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
