---
title: "System::Xml::XmlTextReader::ReadChars méthode"
linktitle: "ReadChars"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlTextReader::ReadChars méthode. Lit le contenu texte d'un élément dans un tampon de caractères. Cette méthode est conçue pour lire de grands flux de texte intégré en l'appelant successivement en C++."
type: docs
weight: 4600
url: /fr/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


Lit le contenu texte d'un élément dans un tampon de caractères. Cette méthode est conçue pour lire de grands flux de texte intégré en l'appelant successivement.

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<char16_t\>\& | Le tableau de caractères qui sert de tampon dans lequel le contenu texte est écrit. |
| indice | int32_t | La position dans **buffer** où la méthode peut commencer à écrire le contenu texte. |
| count | int32_t | Le nombre de caractères à écrire dans **buffer**. |

### ReturnValue

Le nombre de caractères lus. Cela peut être 0 si le lecteur n'est pas positionné sur un élément ou s'il n'y a plus de contenu texte à retourner dans le contexte actuel.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
