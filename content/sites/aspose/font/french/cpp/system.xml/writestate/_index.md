---
title: "énumération System::Xml::WriteState"
linktitle: "ÉtatÉcriture"
second_title: "Aspose.Font pour C++"
description: "énumération System::Xml::WriteState. Spécifie l'état du XmlWriter en C++."
type: docs
weight: 5700
url: /fr/cpp/system.xml/writestate/
---
## WriteState enum


Spécifie l'état du [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Démarrer | 0 | Indique que la méthode XmlWriter::Write n'a pas encore été appelée. |
| Prologue | 1 | Indique que le prologue est en cours d'écriture. |
| Élément | 2 | Indique qu'une balise d'ouverture d'élément est en cours d'écriture. |
| Attribut | 3 | Indique qu'une valeur d'attribut est en cours d'écriture. |
| Contenu | 4 | Indique que le contenu d'un élément est en cours d'écriture. |
| Closed | 5 | Indique que la méthode [XmlWriter::Close](../xmlwriter/close/) a été appelée. |
| Error | 6 | Une exception a été levée, ce qui a laissé le [XmlWriter](../xmlwriter/) dans un état invalide. Vous pouvez appeler la méthode [XmlWriter::Close](../xmlwriter/close/) pour placer le [XmlWriter](../xmlwriter/) dans l'état [WriteState::Closed](./). Tout autre appel de méthode du [XmlWriter](../xmlwriter/) entraîne une InvalidOperationException. |

## Voir aussi

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
