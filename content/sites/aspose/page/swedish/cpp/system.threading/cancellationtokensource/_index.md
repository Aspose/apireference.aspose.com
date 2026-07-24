---
title: "System::Threading::CancellationTokenSource klass"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page för C++"
description: "System::Threading::CancellationTokenSource klass. En avbokningstokenkälla som kan användas för att trigga avbokningsaviseringar i C++."
type: docs
weight: 400
url: /sv/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


En avbokningstokenkälla som kan användas för att utlösa avbokningsnotifikationer.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Cancel](./cancel/)() | Kommunicerar en begäran om avbokning. |
| [CancellationTokenSource](./cancellationtokensource/)() | Skapar en ny [CancellationTokenSource](./). |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Skapar en länkad tokenkälla som avbryts när någon av de angivna tokenarna avbryts. |
| [Dispose](./dispose/)() override | Frigör alla resurser som används av [CancellationTokenSource](./). |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Hämtar om avbokning har begärts. |
| [get_Token](./get_token/)() const | Hämtar avbokningstoken som är associerad med denna källa. |
## Anmärkningar


Tillhandahåller mekanismer för att skapa och styra avbokningstoken för samarbetsavbokning av operationer.
## Se även

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
