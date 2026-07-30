---
title: "classe System::IO::BinaryReader"
linktitle: "BinaryReader"
second_title: "Aspose.Font per C++"
description: "classe System::IO::BinaryReader. Rappresenta un lettore che legge tipi di dati primitivi come dati binari in una codifica particolare. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.io/binaryreader/
---
## BinaryReader class


Rappresenta un lettore che legge tipi di dati primitivi come dati binari in una codifica particolare. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class BinaryReader : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | Crea un'istanza della classe [BinaryReader](./) che legge i dati dallo stream specificato usando la codifica UTF-8. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Crea un'istanza della classe [BinaryReader](./) che legge i dati dallo stream specificato usando la codifica specificata. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | Crea un'istanza della classe [BinaryReader](./) che legge i dati dallo stream specificato usando la codifica specificata. |
| virtual [Close](./close/)() | Chiude l'oggetto [BinaryReader](./) corrente e lo stream di input sottostante. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude lo stream sottostante. |
| virtual [get_BaseStream](./get_basestream/)() | Restituisce lo stream di input. |
| virtual [PeekChar](./peekchar/)() | Legge un singolo carattere dallo stream di input senza modificare il cursore di lettura dello stream. |
| virtual [Read](./read/)() | Legge un singolo carattere dallo stream di input. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | Legge il numero specificato di byte dallo stream di input e li scrive nell'array di byte specificato. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Legge il numero specificato di caratteri dallo stream di input, li converte nella codifica UTF-16 e scrive i caratteri UTF-16 risultanti nell'array di caratteri specificato a partire dalla posizione specificata. |
| virtual [ReadBoolean](./readboolean/)() | Legge un singolo byte dallo stream di input e restituisce la sua rappresentazione booleana. |
| virtual [ReadByte](./readbyte/)() | Legge un singolo byte dallo stream di input. |
| virtual [ReadBytes](./readbytes/)(int) | Legge il numero specificato di byte dallo stream di input. |
| virtual [ReadChar](./readchar/)() | Legge un singolo carattere dallo stream di input. |
| virtual [ReadChars](./readchars/)(int) | Legge il numero specificato di caratteri dallo stream di input e li restituisce in codifica UTF-16. |
| virtual [ReadDecimal](./readdecimal/)() | NON IMPLEMENTATO. |
| virtual [ReadDouble](./readdouble/)() | Legge 8 byte dallo stream di input e li restituisce come valore a virgola mobile a doppia precisione. |
| virtual [ReadInt16](./readint16/)() | Legge 2 byte dallo stream di input e li restituisce come valore intero a 16 bit. |
| virtual [ReadInt32](./readint32/)() | Legge 4 byte dallo stream di input e li restituisce come valore intero a 32 bit. |
| virtual [ReadInt64](./readint64/)() | Legge 8 byte dallo stream di input e li restituisce come valore intero a 64 bit. |
| virtual [ReadSByte](./readsbyte/)() | Legge un singolo byte dallo stream di input e lo restituisce come valore intero con segno a 8 bit. |
| virtual [ReadSingle](./readsingle/)() | Legge 4 byte dallo stream di input e li restituisce come valore a virgola mobile a precisione singola. |
| virtual [ReadString](./readstring/)() | Legge una stringa dal flusso corrente. La stringa è preceduta dalla lunghezza, codificata come un intero a sette bit alla volta. |
| virtual [ReadUInt16](./readuint16/)() | Legge 2 byte dal flusso di input e li restituisce come valore intero senza segno a 16 bit. |
| virtual [ReadUInt32](./readuint32/)() | Legge 4 byte dal flusso di input e li restituisce come valore intero senza segno a 32 bit. |
| virtual [ReadUInt64](./readuint64/)() | Legge 8 byte dal flusso di input e li restituisce come valore intero senza segno a 64 bit. |
| virtual [~BinaryReader](./~binaryreader/)() | Distruttore. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
