---
title: "System::Drawing::CopyPixelOperation enum"
linktitle: "CopyPixelOperation"
second_title: "Aspose.Page för C++"
description: "System::Drawing::CopyPixelOperation enum. Anger hur källfärgen i en pixelkopieringsoperation kombineras med destinationsfärgen för att resultera i en slutgiltig färg i C++."
type: docs
weight: 3000
url: /sv/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


Anger hur källfärgen i en pixelkopieringsoperation kombineras med destinationsfärgen för att resultera i en slutgiltig färg.

```cpp
enum class CopyPixelOperation
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| NoMirrorBitmap | n/a | Bitmap‑bilden är inte speglad. |
| Svarthet | 66 | Destinationsområdet fylls genom att använda färgen med index 0 i den fysiska paletten. |
| NotSourceErase | 1114278 | Käll‑ och destinationsfärgerna OR‑as och den resulterande färgen inverteras sedan. |
| NotSourceCopy | 3342344 | Källområdet inverteras och kopieras sedan till destinationen. |
| SourceErase | 4457256 | De inverterade färgerna i destinationsområdet är ANDade med färgerna i källområdet. |
| DestinationInvert | 5570569 | Destinationsområdet är inverterat. |
| PatInvert | 5898313 | Färgerna på den för närvarande valda penseln i destinationsenhetens kontext XORas med färgerna i destinationen. |
| SourceInvert | 6684742 | Färgerna i käll- och destinationsområdena är XORade. |
| SourceAnd | 8913094 | Färgerna i käll- och destinationsområdena är ANDade. |
| MergePaint | 12255782 | Färgerna i det inverterade källområdet är ORade med färgerna i destinationsområdet. |
| MergeCopy | 12583114 | Färgerna i källområdet är ANDade med färgerna på den valda penseln i destinationsenhetens kontext. |
| SourceCopy | 13369376 | Källområdet kopieras direkt till destinationsområdet. |
| SourcePaint | 15597702 | Färgerna i käll- och destinationsregionerna är OR:ade. |
| PatCopy | 15728673 | Penseln som för närvarande är vald i destinationsenhetens kontext kopieras till destinationsbitmapen. |
| PatPaint | 16452105 | Färgerna på penseln som för närvarande är vald i destinationsenhetens kontext OR:as med färgerna i den inverterade källregionen. Resultatet av denna operation OR:as med färgerna i destinationsregionen. |
| Vithet | 16711778 | Destinationsregionen fylls genom att använda färgen med index 1 i den fysiska paletten. |
| CaptureBlt | 1073741824 | [Windows](../../system.windows/) som är lagrade ovanpå applikationens fönster inkluderas i den resulterande bilden. |

## Se även

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
