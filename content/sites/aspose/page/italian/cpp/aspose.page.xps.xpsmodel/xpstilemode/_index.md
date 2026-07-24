---
title: "Aspose::Page::XPS::XpsModel::XpsTileMode enum"
linktitle: "XpsTileMode"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsTileMode enum. Valori validi della proprietà TileMode dei pennelli di tiling in C++."
type: docs
weight: 5500
url: /it/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Valori validi della proprietà TileMode dei pennelli di piastrellatura.

```cpp
enum class XpsTileMode
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | In questa modalità, viene disegnata solo la singola tessera di base. L'area rimanente rimane trasparente. |
| Tile | 1 | In questa modalità, la tessera di base viene disegnata e l'area rimanente viene riempita ripetendo la tessera di base in modo che il bordo destro di ogni tessera si trovi accanto al bordo sinistro della successiva, e il bordo inferiore di ogni tessera si trovi accanto al bordo superiore della successiva. |
| FlipX | 2 | La disposizione delle tessere è simile alla modalità Tile, ma le colonne alternate di tessere sono capovolte orizzontalmente. La tessera di base è posizionata come specificato dalla viewport. Le tessere nelle colonne a sinistra e a destra di questa tessera sono capovolte orizzontalmente. |
| FlipY | 3 | La disposizione delle tessere è simile alla modalità Tile, ma le righe alternate di tessere sono capovolte verticalmente. La tessera di base è posizionata come specificato dalla viewport. Le righe sopra e sotto sono capovolte verticalmente. |
| FlipXY | 4 | La disposizione delle tessere è simile alla modalità Tile tile, ma le colonne alternate di tessere sono capovolte orizzontalmente e le righe alternate di tessere sono capovolte verticalmente. La tessera di base è posizionata come specificato dalla viewport. |

## Vedi anche

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
