---
title: "System::Xml::NewLineHandling enum"
linktitle: "NewLineHandling"
second_title: "Aspose.Page pour C++"
description: "System::Xml::NewLineHandling enum. Spécifie comment gérer les sauts de ligne en C++."
type: docs
weight: 5200
url: /fr/cpp/system.xml/newlinehandling/
---
## NewLineHandling enum


Spécifie comment gérer les sauts de ligne.

```cpp
enum class NewLineHandling
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Replace | 0 | Les caractères de nouvelle ligne sont remplacés pour correspondre au caractère spécifié dans la valeur de [XmlWriterSettings::set_NewLineChars](../xmlwritersettings/set_newlinechars/). |
| Entitize | 1 | Les caractères de nouvelle ligne sont transformés en entités. Ce paramètre préserve tous les caractères lorsque la sortie est lue par un [XmlReader](../xmlreader/) normalisateur. |
| None | 2 | Les caractères de nouvelle ligne restent inchangés. La sortie est identique à l’entrée. |

## Voir aussi

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
