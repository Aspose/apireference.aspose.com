---
title: System.Drawing.Imaging
second_title: Aspose.Drawing per .NET API Reference
description: IlImaging namespace fornisce funzionalità di imaging GDI avanzate. La funzionalità grafica di base è fornita daDrawing spazio dei nomi.
type: docs
weight: 40
url: /it/net/system.drawing.imaging/
---
IlImaging namespace fornisce funzionalità di imaging GDI+ avanzate. La funzionalità grafica di base è fornita daDrawing spazio dei nomi.

## Classi

| Classe | Descrizione |
| --- | --- |
| [BitmapData](./bitmapdata) | Specifica gli attributi di un'immagine bitmap. IlBitmapData la classe è utilizzata da LockBits eUnlockBits metodi delBitmap classe. Non ereditabile. |
| [ColorMap](./colormap) | Definisce una mappa per la conversione dei colori. Diversi metodi diImageAttributes class adjust image colors utilizzando una tabella di rimappatura dei colori, che è una matrice diColorMap strutture. Non ereditabile. |
| [ColorMatrix](./colormatrix) | Definisce una matrice 5 x 5 che contiene le coordinate per lo spazio RGBA. Diversi metodi diImageAttributes classe regola i colori dell'immagine utilizzando una matrice di colori. Questa classe non può essere ereditata. |
| [ColorPalette](./colorpalette) | Definisce una matrice di colori che compongono una tavolozza di colori. I colori sono colori ARGB a 32 bit. Non ereditabile. |
| [Encoder](./encoder) | AnEncoder oggetto incapsula un identificatore univoco globale (GUID) che identifica la categoria di un parametro del codificatore di immagini. |
| [EncoderParameter](./encoderparameter) | Utilizzato per passare un valore, o una matrice di valori, a un codificatore di immagini. |
| [EncoderParameters](./encoderparameters) | Incapsula una matrice diEncoderParameter oggetti. |
| [FrameDimension](./framedimension) | Fornisce proprietà che ottengono le dimensioni della cornice di un'immagine. Non ereditabile. |
| [ImageAttributes](./imageattributes) | Contiene informazioni su come vengono manipolati i colori bitmap e metafile durante il rendering. |
| [ImageCodecInfo](./imagecodecinfo) | IlImageCodecInfo fornisce i membri di archiviazione ei metodi necessari per recuperare tutte le informazioni pertinenti sui codificatori e decodificatori di immagini installati (chiamati codec). Non ereditabile. |
| [ImageFormat](./imageformat) | Specifica il formato file dell'immagine. Non ereditabile. |
| [Metafile](./metafile) | Definisce un metafile grafico. Un metafile contiene record che descrivono una sequenza di operazioni grafiche che possono essere registrate (costruite) e riprodotte (visualizzate). Questa classe non è ereditabile. |
| [MetafileHeader](./metafileheader) | Contiene gli attributi di un associatoMetafile . Non ereditabile. |
| [MetaHeader](./metaheader) | Contiene informazioni su un metafile in formato Windows (WMF). |
| [NamespaceDoc](./namespacedoc) | IlImaging namespace fornisce funzionalità di imaging GDI+ avanzate. La funzionalità grafica di base è fornita daDrawing spazio dei nomi. |
| [PlayRecordCallback](./playrecordcallback) | Questo delegato non è utilizzato. Per un esempio di enumerare i record di un metafile, vedere[`EnumerateMetafile`](../system.drawing/graphics/enumeratemetafile) . |
| [PropertyItem](./propertyitem) | Incapsula una proprietà di metadati da includere in un file immagine. Non ereditabile. |
| [WmfPlaceableFileHeader](./wmfplaceablefileheader) | Definisce un metafile posizionabile. Non ereditabile. |
## Enumerazione

| Enumerazione | Descrizione |
| --- | --- |
| [ColorAdjustType](./coloradjusttype) | Specifica quali oggetti GDI+ utilizzano le informazioni sulla regolazione del colore. |
| [ColorChannelFlag](./colorchannelflag) | Specifica i singoli canali nello spazio colore CMYK (ciano, magenta, giallo, nero). Questa enumerazione viene utilizzata dal[`SetOutputChannel`](../system.drawing.imaging/imageattributes/setoutputchannel) metodi. |
| [ColorMatrixFlag](./colormatrixflag) | Specifica i tipi di immagini e colori che saranno interessati dalle impostazioni di regolazione del colore e della scala di grigi di unImageAttributes . |
| [EmfPlusRecordType](./emfplusrecordtype) | Specifica i metodi disponibili per l'uso con un metafile per leggere e scrivere comandi grafici. |
| [EmfType](./emftype) | Specifica la natura dei record inseriti in un file Enhanced Metafile (EMF). Questa enumerazione viene utilizzata da diversi costruttori nelMetafile classe. |
| [EncoderValue](./encodervalue) | Utilizzato per specificare il valore del parametro passato a un codificatore di immagini JPEG o TIFF quando si utilizza ilEncoderParameters) oEncoderParameters) metodi. |
| [ImageFlags](./imageflags) | Specifica gli attributi dei dati pixel contenuti in un[`Image`](../system.drawing/image) oggetto. La proprietà Flags restituisce un membro di questa enumerazione. Questa enumerazione ha un attributo FlagsAttribute che consente una combinazione bit per bit dei valori dei suoi membri. |
| [ImageLockMode](./imagelockmode) | Specifica i flag che vengono passati al parametro flags di[`LockBits`](../system.drawing/bitmap/lockbits) metodo. Il[`LockBits`](../system.drawing/bitmap/lockbits) il metodo blocca una parte di un'immagine in modo che tu possa leggere o scrivere i dati dei pixel. |
| [MetafileFrameUnit](./metafileframeunit) | Specifica l'unità di misura del rettangolo utilizzato per dimensionare e posizionare un metafile. Viene specificato durante la creazione delMetafile oggetto. |
| [MetafileType](./metafiletype) | Specifica i tipi di metafile. |
| [PixelFormat](./pixelformat) | Specifica il formato dei dati del colore per ogni pixel nell'immagine. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
