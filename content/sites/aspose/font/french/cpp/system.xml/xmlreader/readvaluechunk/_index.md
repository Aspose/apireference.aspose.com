---
title: "méthode System::Xml::XmlReader::ReadValueChunk"
linktitle: "ReadValueChunk"
second_title: "Aspose.Font pour C++"
description: "méthode System::Xml::XmlReader::ReadValueChunk. Lit de grands flux de texte intégrés dans un document XML en C++."
type: docs
weight: 7400
url: /fr/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


Lit de grands flux de texte intégrés dans un document XML.

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<char16_t\> | Le tableau de caractères qui sert de tampon dans lequel le contenu texte est écrit. Cette valeur ne peut pas être **nullptr**. |
| index | int32_t | Le décalage dans le tampon où le [XmlReader](../) peut commencer à copier les résultats. |
| count | int32_t | Le nombre maximal de caractères à copier dans le tampon. Le nombre réel de caractères copiés est renvoyé par cette méthode. |

### ReturnValue

Le nombre de caractères lus dans le tampon. La valeur zéro est renvoyée lorsqu'il n'y a plus de contenu texte.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
