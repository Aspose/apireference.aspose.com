---
title: "System::Xml::WriteState énumération"
linktitle: "WriteState"
second_title: "Aspose.Page pour C++"
description: "System::Xml::WriteState énumération. Spécifie l’état du XmlWriter en C++."
type: docs
weight: 5700
url: /fr/cpp/system.xml/writestate/
---
## WriteState enum


Spécifie l’état du [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Démarrer | 0 | Indique que la méthode XmlWriter::Write n’a pas encore été appelée. |
| Prolog | 1 | Indique que le prologue est en cours d’écriture. |
| Element | 2 | Indique qu’une balise d’ouverture d’élément est en cours d’écriture. |
| Attribute | 3 | Indique qu’une valeur d’attribut est en cours d’écriture. |
| Content | 4 | Indique que le contenu de l’élément est en cours d’écriture. |
| Closed | 5 | Indique que la méthode [XmlWriter::Close](../xmlwriter/close/) a été appelée. |
| Error | 6 | Une exception a été levée, laissant le [XmlWriter](../xmlwriter/) dans un état invalide. Vous pouvez appeler la méthode [XmlWriter::Close](../xmlwriter/close/) pour placer le [XmlWriter](../xmlwriter/) dans l’état [WriteState::Closed](./). Tout autre appel de méthode du [XmlWriter](../xmlwriter/) entraîne une InvalidOperationException. |

## Voir aussi

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
