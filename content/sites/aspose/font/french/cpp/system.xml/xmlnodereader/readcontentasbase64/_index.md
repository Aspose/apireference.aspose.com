---
title: "méthode System::Xml::XmlNodeReader::ReadContentAsBase64"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font pour C++"
description: "méthode System::Xml::XmlNodeReader::ReadContentAsBase64. Lit le contenu et renvoie les octets binaires décodés en Base64 en C++."
type: docs
weight: 3200
url: /fr/cpp/system.xml/xmlnodereader/readcontentasbase64/
---
## XmlNodeReader::ReadContentAsBase64 method


Lit le contenu et renvoie les octets binaires décodés en Base64.

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
