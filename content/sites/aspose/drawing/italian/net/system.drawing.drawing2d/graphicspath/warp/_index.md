---
title: Warp
second_title: Aspose.Drawing per .NET API Reference
description: Applica una trasformata warp definita da un rettangolo e un parallelogramma a questoGraphicsPathsystem.drawing.drawing2d/graphicspath .
type: docs
weight: 350
url: /it/net/system.drawing.drawing2d/graphicspath/warp/
---
## Warp(PointF[], RectangleF) {#warp}

Applica una trasformata warp, definita da un rettangolo e un parallelogramma, a questo[`GraphicsPath`](../../graphicspath) .

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destPoints | PointF[] | Una matrice diPointF strutture che definiscono un parallelogramma a cui il rettangolo definito da*srcRect* viene trasformato. L'array può contenere tre o quattro elementi. Se l'array contiene tre elementi, l'angolo inferiore destro del parallelogramma è implicato dai primi tre punti. |
| srcRect | RectangleF | UNRectangleF che rappresenta il rettangolo che si trasforma nel parallelogramma definito da*destPoints* . |

### Guarda anche

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [GraphicsPath](../../graphicspath)
* spazio dei nomi [System.Drawing.Drawing2D](../../graphicspath)
* assemblea [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix) {#warp_1}

Applica una trasformata warp, definita da un rettangolo e un parallelogramma, a questo[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destPoints | PointF[] | Una matrice diPointF strutture che definiscono un parallelogramma a cui il rettangolo definito da*srcRect* viene trasformato. L'array può contenere tre o quattro elementi. Se l'array contiene tre elementi, l'angolo inferiore destro del parallelogramma è implicato dai primi tre punti. |
| srcRect | RectangleF | UNRectangleF che rappresenta il rettangolo che si trasforma nel parallelogramma definito da*destPoints* . |
| matrix | Matrix | UN[`Matrix`](../../matrix) che specifica una trasformazione geometrica da applicare al tracciato. |

### Guarda anche

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* class [GraphicsPath](../../graphicspath)
* spazio dei nomi [System.Drawing.Drawing2D](../../graphicspath)
* assemblea [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode) {#warp_2}

Applica una trasformata warp, definita da un rettangolo e un parallelogramma, a questo[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destPoints | PointF[] | Una matrice diPointF strutture che definisce un parallelogramma a cui il rettangolo definito da*srcRect* viene trasformato. L'array può contenere tre o quattro elementi. Se l'array contiene tre elementi, l'angolo inferiore destro del parallelogramma è implicato dai primi tre punti. |
| srcRect | RectangleF | UNRectangleF che rappresenta il rettangolo che si trasforma nel parallelogramma definito da*destPoints* . |
| matrix | Matrix | UN[`Matrix`](../../matrix) che specifica una trasformazione geometrica da applicare al tracciato. |
| warpMode | WarpMode | UN[`WarpMode`](../../warpmode) enumerazione che specifica se questa operazione di warp utilizza la modalità prospettica o bilineare. |

### Guarda anche

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* enum [WarpMode](../../warpmode)
* class [GraphicsPath](../../graphicspath)
* spazio dei nomi [System.Drawing.Drawing2D](../../graphicspath)
* assemblea [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode, float) {#warp_3}

Applica una trasformata warp, definita da un rettangolo e un parallelogramma, a questo[`GraphicsPath`](../../graphicspath).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode, 
    float flatness)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destPoints | PointF[] | Una matrice diPointF strutture che definiscono un parallelogramma a cui il rettangolo definito da*srcRect* viene trasformato. L'array può contenere tre o quattro elementi. Se l'array contiene tre elementi, l'angolo inferiore destro del parallelogramma è implicato dai primi tre punti. |
| srcRect | RectangleF | UNRectangleF che rappresenta il rettangolo che si trasforma nel parallelogramma definito da*destPoints* . |
| matrix | Matrix | UN[`Matrix`](../../matrix) che specifica una trasformazione geometrica da applicare al tracciato. |
| warpMode | WarpMode | UN[`WarpMode`](../../warpmode) enumerazione che specifica se questa operazione di warp utilizza la modalità prospettica o bilineare. |
| flatness | Single | Un valore compreso tra 0 e 1 che specifica quanto è piatto il percorso risultante. Per ulteriori informazioni, vedere il[`Flatten`](../flatten) metodi. |

### Guarda anche

* struct [PointF](../../../system.drawing/pointf)
* struct [RectangleF](../../../system.drawing/rectanglef)
* class [Matrix](../../matrix)
* enum [WarpMode](../../warpmode)
* class [GraphicsPath](../../graphicspath)
* spazio dei nomi [System.Drawing.Drawing2D](../../graphicspath)
* assemblea [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
