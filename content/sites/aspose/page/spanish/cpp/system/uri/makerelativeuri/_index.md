---
title: "System::Uri::MakeRelativeUri method"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Page para C++"
description: "System::Uri::MakeRelativeUri method. Determina la diferencia entre los URI representados por el objeto actual y los objetos Uri especificados en C++."
type: docs
weight: 3100
url: /es/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Determina la diferencia entre los URI representados por el objeto actual y los objetos [Uri](../) especificados.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | El comparando |

### ReturnValue

Si el nombre de host y el esquema de los URI representados por el objeto actual y **toUri** son los mismos, este método devuelve un [Uri](../) relativo que, al añadirse a la instancia actual de URI, produce **toUri**. Si el nombre de host o el esquema son diferentes, este método devuelve un objeto [Uri](../) que representa el parámetro **uri**.

## Ver también

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
