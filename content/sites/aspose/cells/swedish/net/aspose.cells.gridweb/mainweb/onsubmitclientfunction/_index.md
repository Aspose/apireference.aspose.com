---
title: OnSubmitClientFunction
second_title: Aspose.Cells för .NET API-referens
description: Hämtar eller ställer in klientfunktionen som ska anropas innan kontrollen skickas på klientsidan. Klientfunktionen ska deklareras så här function MyOnSubmitarg cancelEdit  returnera sant Arg är submit-argumentet innehåller kommandot som ska skickas till servern. CancelEdit är booleskt värde indikerar om kontrollen har förkastat användarinmatningen innan submit. Kontrollen kommer att fortsätta skicka om funktionen returnerar true.  Obs Du kan använda den här-pekaren i klientfunktionen för att peka på rutnätskontrollen som utlöser händelsen.
type: docs
weight: 700
url: /sv/net/aspose.cells.gridweb/mainweb/onsubmitclientfunction/
---
## MainWeb.OnSubmitClientFunction property

Hämtar eller ställer in klientfunktionen som ska anropas innan kontrollen skickas på klientsidan. Klientfunktionen ska deklareras så här: function MyOnSubmit(arg, cancelEdit) { returnera sant;} Arg är submit-argumentet, innehåller kommandot som ska skickas till servern. CancelEdit är booleskt värde indikerar om kontrollen har förkastat användarinmatningen innan submit. Kontrollen kommer att fortsätta skicka om funktionen returnerar true.  Obs: Du kan använda "den här"-pekaren i klientfunktionen för att peka på rutnätskontrollen som utlöser händelsen.

```csharp
public string OnSubmitClientFunction { get; set; }
```

### Se även

* class [MainWeb](../../mainweb)
* namnutrymme [Aspose.Cells.GridWeb](../../mainweb)
* hopsättning [Aspose.Cells.GridWeb](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.GridWeb.dll -->
