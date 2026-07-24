---
title: "Klasse System::Runtime::InteropServices::Marshal"
linktitle: "Marshal"
second_title: "Aspose.Page für C++"
description: "Klasse System::Runtime::InteropServices::Marshal. Bietet eine Marshalling-Implementierung. Nur zur Kompatibilität mit übersetztem Code, da auf der C++-Seite kein verwalteter Code unterstützt wird. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten unter keinen Umständen Instanzen davon in C++ erstellen."
type: docs
weight: 100
url: /de/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Bietet eine Marshalling-Implementierung. Nur zur Kompatibilität mit übersetztem Code, da auf der C++-Seite kein verwalteter Code unterstützt wird. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class Marshal
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Allokiert nicht verwalteten Speicher. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Allokiert nicht verwalteten Speicher. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | Implementiert die Semantik von public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const void *, container\&&, int, int) | Implementiert die Semantik von public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const container\&, int, void *, int) | Implementiert public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | Implementiert public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Gibt nicht verwalteten Speicher frei. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | Ermittelt HResult aus einer Ausnahme. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Erstellt ein verwaltetes [String](../../system/string/) aus einem nicht verwalteten nullterminierten UTF8-String. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Erstellt ein verwaltetes [String](../../system/string/) aus einem nicht verwalteten UTF8-String. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Erstellt ein verwaltetes [String](../../system/string/) aus einem nicht verwalteten nullterminierten String. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Erstellt ein verwaltetes [String](../../system/string/) aus einem nicht verwalteten String. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Erstellt ein verwaltetes [String](../../system/string/) aus einem nicht verwalteten nullterminierten Unicode-String. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Erstellt ein verwaltetes [String](../../system/string/) aus einem nicht verwalteten Unicode-String. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Erstellt ein verwaltetes [String](../../system/string/) aus einem nicht verwalteten nullterminierten UTF8-String. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Erstellt ein verwaltetes [String](../../system/string/) aus einem nicht verwalteten UTF8-String. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Liest ein Byte aus dem Speicher. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Liest ein Short aus dem Speicher. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Liest ein Int aus dem Speicher. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Kopiert den Inhalt der angegebenen SecureString in nicht verwalteten Speicher und konvertiert ihn in das ANSI-Format. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Kopiert den Inhalt der angegebenen SecureString in nicht verwalteten Speicher. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Kopiert den Inhalt einer angegebenen Zeichenkette in nicht verwalteten Speicher. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Kopiert den Inhalt einer angegebenen Zeichenkette in nicht verwalteten Speicher und konvertiert ihn bei Bedarf in das ANSI-Format. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Kopiert den Inhalt einer angegebenen Zeichenkette in nicht verwalteten Speicher. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Schreibt ein Byte in den Speicher. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Schreibt ein Byte in den Speicher. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Schreibt ein Short in den Speicher. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | Schreibt ein Int in den Speicher. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | Schreibt ein Long in den Speicher. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | Gibt den nicht verwalteten String-Zeiger frei, der mit der Methode SecureStringToGlobalAllocAnsi alloziert wurde. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | Gibt den nicht verwalteten String-Zeiger frei, der mit der Methode SecureStringToGlobalAllocUnicode alloziert wurde. |
## Siehe auch

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Page for C++](../../)
