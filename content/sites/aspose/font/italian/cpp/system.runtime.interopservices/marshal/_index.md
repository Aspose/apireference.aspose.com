---
title: "Classe System::Runtime::InteropServices::Marshal"
linktitle: "Marshal"
second_title: "Aspose.Font per C++"
description: "Classe System::Runtime::InteropServices::Marshal. Fornisce l'implementazione del marshalling. Solo per compatibilità con il codice tradotto, poiché nessun codice gestito è supportato sul lato C++. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 100
url: /it/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Fornisce l'implementazione del marshalling. Solo per compatibilità con il codice tradotto, poiché il codice gestito non è supportato sul lato C++. Si tratta di un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class Marshal
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Alloca memoria non gestita. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Alloca memoria non gestita. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | Implementa la semantica public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const void *, container\&&, int, int) | Implementa la semantica public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const container\&, int, void *, int) | Implementa public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | Implementa public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Libera memoria non gestita. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | Ottiene HResult dall'eccezione. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Crea una [String](../../system/string/) gestita da una stringa UTF8 non gestita terminata a zero. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Crea una [String](../../system/string/) gestita da una stringa UTF8 non gestita. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Crea una [String](../../system/string/) gestita da una stringa non gestita terminata a zero. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Crea una [String](../../system/string/) gestita da una stringa non gestita. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Crea una [String](../../system/string/) gestita da una stringa Unicode non gestita terminata a zero. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Crea una [String](../../system/string/) gestita da una stringa Unicode non gestita. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Crea una [String](../../system/string/) gestita da una stringa UTF8 non gestita terminata a zero. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Crea una [String](../../system/string/) gestita da una stringa UTF8 non gestita. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Legge un byte dalla memoria. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Legge un short dalla memoria. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Legge un int dalla memoria. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Copia il contenuto della stringa sicura specificata nella memoria non gestita, convertendo nel formato ANSI. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Copia il contenuto della stringa sicura specificata nella memoria non gestita. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Copia il contenuto di una stringa specificata nella memoria non gestita. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Copia il contenuto di una stringa specificata nella memoria non gestita, convertendo nel formato ANSI se necessario. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Copia il contenuto di una stringa specificata nella memoria non gestita. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Scrive un byte nella memoria. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Scrive un byte nella memoria. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Scrive un short nella memoria. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | Scrive un int nella memoria. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | Scrive long in memoria. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | Libera il puntatore a stringa non gestita che è stato allocato usando il metodo SecureStringToGlobalAllocAnsi. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | Libera il puntatore a stringa non gestita che è stato allocato usando il metodo SecureStringToGlobalAllocUnicode. |
## Vedi anche

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Font for C++](../../)
