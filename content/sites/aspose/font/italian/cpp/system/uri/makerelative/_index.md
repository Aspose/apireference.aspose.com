---
title: "System::Uri::MakeRelative metodo"
linktitle: "MakeRelative"
second_title: "Aspose.Font per C++"
description: "System::Uri::MakeRelative metodo. Determina la differenza tra due istanze di Uri in C++."
type: docs
weight: 3000
url: /it/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


Determina la differenza tra due istanze di [Uri](../).

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | L'URI da confrontare con l'URI corrente |

### ReturnValue

Se il nome host e lo schema degli URI rappresentati dall'oggetto corrente e **toUri** sono gli stessi, questo metodo restituisce un [String](../../string/) che rappresenta un [Uri](../) relativo, che quando aggiunto all'istanza corrente di URI produce **toUri**. Se il nome host o lo schema sono diversi, allora questo metodo restituisce un [String](../../string/) che rappresenta il parametro **uri**.

## Vedi anche

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
