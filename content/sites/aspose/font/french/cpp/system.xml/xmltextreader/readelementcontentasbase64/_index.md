---
title: "System::Xml::XmlTextReader::ReadElementContentAsBase64 méthode"
linktitle: "LireContenuÉlémentEnBase64"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlTextReader::ReadElementContentAsBase64 méthode. Lit l'élément et décode le contenu Base64 en C++."
type: docs
weight: 4900
url: /fr/cpp/system.xml/xmltextreader/readelementcontentasbase64/
---
## XmlTextReader::ReadElementContentAsBase64 method


Lit l'élément et décode le contenu Base64.

```cpp
int32_t System::Xml::XmlTextReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
