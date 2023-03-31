---
title: Class CompositeGridConfig
second_title: Aspose.OMR per Riferimento API .NET
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig classe. Elemento griglia. Produce una serie di bolle. Ogni bolla piena rappresenta un simbolo nel valore composito Tutti i simboli contrassegnati verranno concatenati in un singolo valore
type: docs
weight: 120
url: /it/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

Elemento griglia. Produce una serie di bolle. Ogni bolla piena rappresenta un simbolo nel valore composito Tutti i simboli contrassegnati verranno concatenati in un singolo valore

```csharp
public class CompositeGridConfig : BaseConfig
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | Default_Costruttore |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | Il tipo di bolla |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | Quando l'elemento è disegnato in un genitore a più colonne - rappresenta la posizione. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | Quantità di colonne all'interno della griglia. Ogni colonna rappresenta un singolo simbolo nel risultato value L'importo deve essere uguale a[`ExtraRow`](./extrarow/) quantità di colonne |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | Dovrebbe essere visualizzato il nome di questa griglia |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | Valori specifici della colonna che verranno posizionati sopra quelli predefiniti -[`Values`](./values/) . Presentato come matrice bidimensionale. Prima riga. Seconda colonna. Ogni stringa rappresenta il testo all'interno della bolla. se la stringa è nulla non verrà posizionata alcuna bolla. Il numero di colonne deve essere uguale a[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Allineamento della griglia, indica dove deve essere disegnata la griglia sulla pagina |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | Orientamento griglia: orizzontale o verticale. Indica come devono essere posizionati gli elementi figlio |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | Colore bordo quadrato |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | Dimensione bordo quadrato |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | Indica che tipo di elemento disegnare all'inizio della griglia |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | Nome della griglia. Utilizzato come identificatore in recognition |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | Descrive la rotazione dell'elemento Grid attorno al proprio asse. "90" - ruota CompositeGrid di 90 gradi "-90" - ruota ComopositeGrid di -90 gradi |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | Tipo di elemento omr. Campo obbligatorio per la serializzazione JSON. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | Raccolta di stringhe che descriveranno i possibili simboli in ogni colonna. I valori specifici della colonna vengono inseriti in[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | Posizione della griglia X sulla pagina, sovrascrive l'allineamento |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | Posizione griglia Y sulla pagina, sovrascrive l'allineamento |

## Campi

| Nome | Descrizione |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | La dimensione di una bolla |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | Il margine tra le righe |

### Guarda anche

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* spazio dei nomi [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* assemblea [Aspose.OMR](../../)


