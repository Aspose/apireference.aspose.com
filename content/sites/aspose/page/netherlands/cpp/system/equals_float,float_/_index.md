---
title: "System::Equals< float, float > methode"
linktitle: "Gelijk< float, float >"
second_title: "Aspose.Page voor C++"
description: "System::Equals< float, float > methode. Specialisatie voor enkelprecisie zwevende-kommagetallen. Hoewel twee zwevende-komma NaN's volgens IEC 60559:1989 altijd als ongelijk worden vergeleken, vereist het contract voor System.Object.Equals dat overrides moeten voldoen aan de eisen van een equivalentie‑operator. Daarom geven System.Double.Equals en System.Single.Equals True terug bij het vergelijken van twee NaN's, terwijl de gelijkheidsoperator in dat geval False retourneert, zoals vereist door de standaard in C++."
type: docs
weight: 18400
url: /nl/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Specialisatie voor enkelprecisie zwevende-kommagetallen. Hoewel twee zwevende-komma NaN's volgens IEC 60559:1989 altijd als ongelijk worden vergeleken, vereist het contract voor [System.Object.Equals](../object/equals/), dat overrides moeten voldoen aan de eisen van een equivalentie‑operator. Daarom geven System.Double.Equals en System.Single.Equals True terug bij het vergelijken van twee NaN's, terwijl de gelijkheidsoperator in dat geval False retourneert, zoals vereist door de standaard.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| een | const float\& | De eerste operand |
| b | const float\& | De tweede operand |

### ReturnValue

True als beide waarden NaN zijn of gelijk, anders - false

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
