---
title: "System::Xml::XmlNodeReader::LookupNamespace método"
linktitle: "LookupNamespace"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlNodeReader::LookupNamespace método. Resuelve un prefijo de espacio de nombres en el ámbito del elemento actual en C++."
type: docs
weight: 2500
url: /es/cpp/system.xml/xmlnodereader/lookupnamespace/
---
## XmlNodeReader::LookupNamespace method


Resuelve un prefijo de espacio de nombres en el alcance del elemento actual.

```cpp
String System::Xml::XmlNodeReader::LookupNamespace(const String &prefix) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| prefijo | const String\& | El prefijo cuyo URI de espacio de nombres desea resolver. Para coincidir con el espacio de nombres predeterminado, pase una cadena vacía. Esta cadena no tiene que estar atomizada. |

### ReturnValue

El URI del espacio de nombres al que se asigna el prefijo o **nullptr** si no se encuentra un prefijo coincidente.

## Ver también

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
