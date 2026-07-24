---
title: "System::Drawing::Drawing2D::CombineMode enum"
linktitle: "CombineMode"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Drawing2D::CombineMode enum. Specificeert hoe knipregio's worden gecombineerd in C++."
type: docs
weight: 1400
url: /nl/cpp/system.drawing.drawing2d/combinemode/
---
## CombineMode enum


Specificeert hoe knipregio's worden gecombineerd.

```cpp
enum class CombineMode
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Vervangen | 0 | Een knipregio wordt vervangen door een andere. |
| Snij | 1 | De twee knipregio's worden gecombineerd door hun intersectie te nemen. |
| Union | 2 | De twee knipregio's worden gecombineerd door de unie van beide te nemen. |
| Xor | 3 | De twee knipregio's worden gecombineerd door alleen het gebied te nemen dat door één van de regio's wordt omsloten, maar niet door beide. |
| Uitsluiten | 4 | Twee knipregio's worden gecombineerd door het gebied van de eerste regio te nemen dat niet overlapt met de tweede. |
| Complement | 5 | Twee knipregio's worden gecombineerd door het gebied van de tweede regio te nemen dat niet overlapt met de eerste. |

## Zie ook

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
