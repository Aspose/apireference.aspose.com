---
title: "System::Drawing::Drawing2D::CustomLineCap klass"
linktitle: "CustomLineCap"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Drawing2D::CustomLineCap klass. Representerar en användardefinierad linjekap. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Wrappa alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 400
url: /sv/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Representerar en användardefinierad linjekap. Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Wrappa alltid denna klass i pekaren [System::SmartPtr](../../system/smartptr/) och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class CustomLineCap : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Clone](./clone/)() | Returnerar en kopia av det aktuella objektet. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Skapar en ny instans av klassen [CustomLineCap](./) som representerar en användardefinierad linjekap med de angivna egenskaperna. |
| [Dispose](./dispose/)() | Frigör alla operativsystemresurser som erhållits av det aktuella objektet. |
| [get_BaseCap](./get_basecap/)() const | Returnerar baslinjekappen som denna anpassade kappa skapas från. |
| [get_BaseInset](./get_baseinset/)() const | Returnerar avståndet mellan linjen och kappan. |
| [get_StrokeJoin](./get_strokejoin/)() const | Returnerar värdet [LineJoin](../linejoin/) som bestämmer hur linjerna i denna anpassade kappa förenas. |
| [get_WidthScale](./get_widthscale/)() const | Returnerar skalan för denna anpassade kappa. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Hämtar start- och slutlinjekapparna för den anpassade kappan som representeras av det aktuella objektet. |
| [set_BaseCap](./set_basecap/)(LineCap) | Ställer in baslinjekappvärdet för denna anpassade kappa. |
| [set_BaseInset](./set_baseinset/)(float) | Ställer in avståndet mellan linjen och kappan. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Ställer in värdet [LineJoin](../linejoin/) som bestämmer hur linjerna i denna anpassade kappa förenas. |
| [set_WidthScale](./set_widthscale/)(float) | Ställer in skalvärdet för denna anpassade kappa. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Ställer in start- och slutlinjekapparna för den anpassade kappan som representeras av det aktuella objektet. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
