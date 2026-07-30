---
title: "System::Xml::ReadState énum"
linktitle: "ReadState"
second_title: "Aspose.Font pour C++"
description: "System::Xml::ReadState enum. Spécifie l'état du lecteur en C++."
type: docs
weight: 5300
url: /fr/cpp/system.xml/readstate/
---
## ReadState enum


Spécifie l'état du lecteur.

```cpp
enum class ReadState
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Initial | 0 | La méthode [XmlReader::Read](../xmlreader/read/) n\'a pas été appelée. |
| Interactive | 1 | La méthode [XmlReader::Read](../xmlreader/read/) a été appelée. Des méthodes supplémentaires peuvent être appelées sur le lecteur. |
| Erreur | 2 | Une erreur s\'est produite qui empêche la poursuite de l\'opération de lecture. |
| FinDeFichier | 3 | La fin du fichier a été atteinte avec succès. |
| Closed | 4 | La méthode [XmlReader::Close](../xmlreader/close/) a été appelée. |

## Voir aussi

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
