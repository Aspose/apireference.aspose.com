---
title: "System::Drawing::Drawing2D::CombineMode énumération"
linktitle: "CombineMode"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Drawing2D::CombineMode enum. Spécifie comment les régions de découpage sont combinées en C++."
type: docs
weight: 1400
url: /fr/cpp/system.drawing.drawing2d/combinemode/
---
## CombineMode enum


Spécifie comment les régions de découpage sont combinées.

```cpp
enum class CombineMode
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Remplacer | 0 | Une région de découpage est remplacée par une autre. |
| Intersect | 1 | Les deux régions de découpage sont combinées en prenant leur intersection. |
| Union | 2 | Les deux régions de découpage sont combinées en prenant l'union des deux. |
| Xor | 3 | Les deux régions de découpage sont combinées en ne prenant que la zone enfermée par l'une ou l'autre des régions, mais pas les deux. |
| Exclure | 4 | Deux régions de découpage sont combinées en prenant la zone de la première région qui n'intersecte pas la seconde. |
| Complément | 5 | Deux régions de découpage sont combinées en prenant la zone de la seconde région qui n'intersecte pas la première. |

## Voir aussi

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
