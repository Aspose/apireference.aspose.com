---
title: "Método System::Xml::XmlReader::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlReader::LookupNamespace. Cuando se sobrescribe en una clase derivada, resuelve un prefijo de espacio de nombres en el ámbito del elemento actual en C++."
type: docs
weight: 3100
url: /es/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


Cuando se sobrescribe en una clase derivada, resuelve un prefijo de espacio de nombres en el alcance del elemento actual.

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| prefijo | const String\& | El prefijo cuyo URI de espacio de nombres desea resolver. Para coincidir con el espacio de nombres predeterminado, pase una cadena vacía. |

### ReturnValue

El URI del espacio de nombres al que se asigna el prefijo o **nullptr** si no se encuentra un prefijo coincidente.

## Ver también

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
