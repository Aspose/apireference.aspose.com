---
title: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap costruttore"
linktitle: "CustomLineCap"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap costruttore. Crea una nuova istanza della classe CustomLineCap che rappresenta un cappuccio di linea definito dall'utente con le proprietà specificate in C++."
type: docs
weight: 100
url: /it/cpp/system.drawing.drawing2d/customlinecap/customlinecap/
---
## CustomLineCap::CustomLineCap constructor


Crea una nuova istanza della classe [CustomLineCap](../) che rappresenta un cappuccio di linea definito dall'utente con le proprietà specificate.

```cpp
System::Drawing::Drawing2D::CustomLineCap::CustomLineCap(const SharedPtr<GraphicsPath> &fillPath, const SharedPtr<GraphicsPath> &strokePath, LineCap baseCap=LineCap::Flat, float baseInset=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fillPath | const SharedPtr\<GraphicsPath\>\& | Specifica un riempimento per il cappuccio personalizzato |
| strokePath | const SharedPtr\<GraphicsPath\>\& | Specifica un contorno del cappuccio personalizzato |
| baseCap | LineCap | Il cappuccio di linea di base da cui viene creato il cappuccio personalizzato |
| baseInset | float | Specifica la distanza tra la linea e il cappuccio |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../graphicspath/)
* Enum [LineCap](../../linecap/)
* Class [CustomLineCap](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Font for C++](../../../)
