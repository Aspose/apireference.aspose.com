---
title: "System::Uri::MakeRelativeUri metodo"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Font per C++"
description: "System::Uri::MakeRelativeUri metodo. Determina la differenza tra gli URI rappresentati dall'oggetto corrente e dagli oggetti Uri specificati in C++."
type: docs
weight: 3100
url: /it/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Determina la differenza tra gli URI rappresentati dall'oggetto corrente e dagli oggetti [Uri](../) specificati.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Il comparando |

### ReturnValue

Se il nome host e lo schema degli URI rappresentati dall'oggetto corrente e **toUri** sono gli stessi, questo metodo restituisce un [Uri](../) relativo che, quando aggiunto all'istanza URI corrente, produce **toUri**. Se il nome host o lo schema sono diversi, questo metodo restituisce un oggetto [Uri](../) che rappresenta il parametro **uri**.

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
