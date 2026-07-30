---
title: "System::Security::Cryptography::FromBase64Transform Klasse"
linktitle: "FromBase64Transform"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::FromBase64Transform Klasse. Konvertiert die Instanz der CryptoStream‑Klasse von Base64. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1500
url: /de/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


Konvertiert die [CryptoStream](../cryptostream/) Klasseninstanz von Base64. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clear](./clear/)() | Gibt alle Ressourcen frei. |
| [Dispose](./dispose/)() | Gibt die vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [FromBase64Transform](./frombase64transform/)() | Konstruktor. |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | Konstruktor. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Gibt einen Wert zurück, der angibt, ob die aktuelle Transformation wiederverwendet werden kann. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Gibt einen Wert zurück, der angibt, ob mehrere Blöcke transformiert werden können. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Eingabeblockgröße. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Ausgabeblockgröße. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | Destruktor. |
## Siehe auch

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
