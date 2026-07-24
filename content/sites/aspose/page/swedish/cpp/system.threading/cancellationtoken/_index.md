---
title: "System::Threading::CancellationToken class"
linktitle: "CancellationToken"
second_title: "Aspose.Page för C++"
description: "System::Threading::CancellationToken-klass. Sprider en avisering om att operationer bör avbrytas. Denna klass tillhandahåller en mekanism för samarbetsbaserad avbrytning mellan trådar, vilket gör att en tråd kan meddela andra att en operation bör avbrytas i C++."
type: docs
weight: 200
url: /sv/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


Sprider en notifikation om att operationer bör avbrytas. Denna klass tillhandahåller en mekanism för samarbetsbaserat avbrott mellan trådar, vilket gör att en tråd kan meddela andra att en operation bör avbrytas.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Standardkonstruktor. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Returnerar huruvida detta token kan vara i avbrutet tillstånd. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Returnerar huruvida avbrytning har begärts för detta token. |
| static [get_None](./get_none/)() | Returnerar ett tomt [System::Threading::CancellationToken](./)-värde. |
| [Register](./register/)(const Action<>\&) const | Registrerar en återuppringning som kommer att anropas när avbrytning begärs. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | Kastar ett OperationCanceledException om avbrytning har begärts. |
## Anmärkningar



Ett [CancellationToken](./) kan endast avbrytas via dess associerade [CancellationTokenSource](../cancellationtokensource/).

## Se även

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
