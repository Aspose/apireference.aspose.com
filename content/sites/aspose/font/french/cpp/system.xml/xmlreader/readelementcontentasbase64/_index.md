---
title: "Méthode System::Xml::XmlReader::ReadElementContentAsBase64"
linktitle: "LireContenuÉlémentEnBase64"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlReader::ReadElementContentAsBase64. Lit l'élément et décode le contenu Base64 en C++."
type: docs
weight: 5300
url: /fr/cpp/system.xml/xmlreader/readelementcontentasbase64/
---
## XmlReader::ReadElementContentAsBase64 method


Lit l'élément et décode le contenu **Base64**.

```cpp
virtual int32_t System::Xml::XmlReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
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
