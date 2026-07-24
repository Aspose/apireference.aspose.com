---
title: "System::Security::Cryptography::CryptoStream Klasse"
linktitle: "CryptoStream"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::CryptoStream Klasse. Stream‑Implementierung, die einen bestehenden Stream mit einer kryptografischen Funktion umhüllt. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Stream‑Implementierung, die einen bestehenden Stream mit einer kryptografischen Funktion umhüllt. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CryptoStream : public System::IO::Stream
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt die Verbindung. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Konstruktor. |
| [Flush](./flush/)() override | Leert den Puffer in den umhüllten Stream. Tut nichts, da der Transformationsalgorithmus möglicherweise noch auf weitere Daten wartet. |
| [FlushFinalBlock](./flushfinalblock/)() | Schreibt die noch im Puffer befindlichen Daten in den Stream. |
| [get_CanRead](./get_canread/)() const override | Prüft, ob der Stream lesbar ist. |
| [get_CanSeek](./get_canseek/)() const override | Prüft, ob der Stream suchbar ist. |
| [get_CanWrite](./get_canwrite/)() const override | Prüft, ob der Stream beschreibbar ist. |
| [get_Length](./get_length/)() const override | Liefert die Länge des Streams. Nicht unterstützt. |
| [get_Position](./get_position/)() const override | Liefert die aktuelle Position im Stream. Nicht unterstützt. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Liest Daten aus dem Stream. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest Daten aus dem Stream. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Springt zur Position im Stream. Nicht unterstützt. |
| [set_Position](./set_position/)(int64_t) override | Springt zur Position im Stream. Nicht unterstützt. |
| [SetLength](./setlength/)(int64_t) override | Springt zur Größe des Streams. Nicht unterstützt. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schreibt Daten in den Stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schreibt Daten in den Stream. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Siehe auch

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
