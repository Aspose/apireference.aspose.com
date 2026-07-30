---
title: "System::Xml::XmlImplementation::HasFeature méthode"
linktitle: "HasFeature"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlImplementation::HasFeature method. Vérifie si l'implémentation du Document Object Model (DOM) implémente une fonctionnalité spécifique en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Vérifie si l'implémentation du Document [Object](../../../system/object/) Model (DOM) implémente une fonctionnalité spécifique.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| strFeature | const String\& | Le nom du package de la fonctionnalité à tester. Ce nom n'est pas sensible à la casse. |
| strVersion | const String\& | Ceci est le numéro de version du nom du package à tester. Si la version n'est pas spécifiée (**nullptr**), la prise en charge de n'importe quelle version de la fonctionnalité entraîne le retour de **true** par la méthode. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Remarques



Le tableau suivant montre les combinaisons qui font que **HasFeature** renvoie **true**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
