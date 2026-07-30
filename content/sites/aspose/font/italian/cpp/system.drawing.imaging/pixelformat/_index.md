---
title: "System::Drawing::Imaging::PixelFormat enum"
linktitle: "PixelFormat"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Imaging::PixelFormat enum. Specifica il formato dei dati di colore di un pixel in C++."
type: docs
weight: 2600
url: /it/cpp/system.drawing.imaging/pixelformat/
---
## PixelFormat enum


Specifica il formato dei dati colore di un pixel.

```cpp
enum class PixelFormat
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Indexed | 65536 | Specifica che i dati del pixel contengono valori indicizzati di colore, il che significa che sono un indice ai colori nella tabella dei colori di sistema. |
| Gdi | 131072 | Specifica che i dati del pixel contengono colori GDI. |
| Alpha | 262144 | Specifica che i dati del pixel contengono valori alpha che non sono pre-moltiplicati. |
| PAlpha | 524288 | Specifica che i dati del pixel contengono valori alpha pre-moltiplicati. |
| Esteso | 1048576 | Riservato. |
| Canonico | 2097152 | Specifica il formato pixel di 32 bit per pixel con profondità colore a 24 bit e un canale alfa a 8 bit. |
| Non definito | 0 | Specifica che il formato pixel non è definito. |
| Non importa | 0 | Il formato pixel non è specificato. |
| Format1bppIndexed | n/a | Specifica che il formato pixel è a 1 bit per pixel con colore indicizzato. |
| Format4bppIndexed | n/a | Specifica che il formato pixel è a 4 bit per pixel con colore indicizzato. |
| Format8bppIndexed | n/a | Specifica che il formato pixel è a 8 bit per pixel con colore indicizzato. |
| Format16bppGrayScale | n/a | Specifica che il formato pixel è a 16 bit per pixel. L'informazione sul colore specifica 65536 tonalità di grigio. |
| Format16bppRgb555 | n/a | Specifica che il formato pixel è a 16 bit per pixel con 5 bit per ciascuna delle componenti rosso, verde e blu e il bit rimanente non è utilizzato. |
| Format16bppRgb565 | n/a | Specifica che il formato pixel è a 16 bit per pixel con 5 bit per il rosso, 6 bit per il verde e 5 bit per il blu. |
| Format16bppArgb1555 | n/a | Specifica che il formato pixel è a 16 bit per pixel con 5 bit per ciascuna delle componenti rosso, verde e blu e 1 bit per l'alpha. |
| Format24bppRgb | n/a | Specifica che il formato pixel è a 24 bit per pixel con 8 bit per ciascuna delle componenti rosso, verde e blu. |
| Format32bppRgb | n/a | Specifica che il formato pixel è a 32 bit per pixel con 8 bit per ciascuno dei componenti rosso, verde e blu e gli 8 bit rimanenti non sono utilizzati. |
| Format32bppArgb | n/a | Specifica che il formato pixel è a 32 bit per pixel con 8 bit per ciascuno dei componenti rosso, verde e blu e 8 bit per l'alpha. |
| Format32bppPArgb | n/a | Specifica che il formato pixel è a 32 bit per pixel con 8 bit per ciascuno dei componenti rosso, verde e blu e 8 bit per l'alpha. I componenti rosso, verde e blu sono pre-moltiplicati in base al valore del componente alpha. |
| Format48bppRgb | n/a | Specifica che il formato pixel è a 48 bit per pixel con 16 bit per ciascuno dei componenti rosso, verde e blu. |
| Format64bppArgb | n/a | Specifica che il formato pixel è a 64 bit per pixel con 16 bit per ciascuno dei componenti rosso, verde e blu e 16 bit per l'alpha. |
| Format64bppPArgb | n/a | Specifica che il formato pixel è a 64 bit per pixel con 16 bit per ciascuno dei componenti rosso, verde e blu e 16 bit per l'alpha. I componenti rosso, verde e blu sono pre-moltiplicati in base al valore del componente alpha. |
| Format32bppCMYK | n/a | Specifica che il formato pixel è a 32 bit per pixel con 8 bit per ciascuno dei componenti ciano, magenta, giallo e chiave. |
| Max | 16 | Il valore massimo di questo enum. |

## Vedi anche

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
