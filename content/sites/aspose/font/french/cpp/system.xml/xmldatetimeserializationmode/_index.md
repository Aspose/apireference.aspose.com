---
title: "System::Xml::XmlDateTimeSerializationMode énum"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. Spécifie comment traiter la valeur temporelle lors de la conversion entre chaîne et DateTime en C++."
type: docs
weight: 5800
url: /fr/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


Spécifie comment traiter la valeur temporelle lors de la conversion entre chaîne et [DateTime](../../system/datetime/).

```cpp
enum class XmlDateTimeSerializationMode
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Local | 0 | Traiter comme heure locale. Si l'objet [DateTime](../../system/datetime/) représente le Temps Universel Coordonné (UTC), il est converti en heure locale. |
| Utc | 1 | Traiter comme UTC. Si l'objet [DateTime](../../system/datetime/) représente une heure locale, il est converti en UTC. |
| Unspecified | 2 | Traiter comme heure locale si un [DateTime](../../system/datetime/) est converti en chaîne. Si une chaîne est convertie en [DateTime](../../system/datetime/), convertir en heure locale si un fuseau horaire est spécifié. |
| RoundtripKind | 3 | Les informations de fuseau horaire doivent être conservées lors de la conversion. |

## Voir aussi

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
