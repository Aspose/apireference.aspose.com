---
title: "System::Security::Cryptography::ToBase64Transform Klasse"
linktitle: "ToBase64Transform"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::ToBase64Transform Klasse. Konvertiert die CryptoStream Klasseninstanz zu Base64. Objekte dieser Klasse sollten nur über die System::MakeObject() Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 5000
url: /de/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


Konvertiert die [CryptoStream](../cryptostream/) Klasseninstanz zu Base64. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clear](./clear/)() | Gibt alle Ressourcen frei. |
| [Dispose](./dispose/)() | Gibt die vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Gibt einen Wert zurück, der angibt, ob die aktuelle Transformation wiederverwendet werden kann. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Gibt einen Wert zurück, der angibt, ob mehrere Blöcke transformiert werden können. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Eingabeblockgröße. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Ausgabeblockgröße. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | Verarbeitet einen Datenblock und kopiert die Daten in das Ausgabearray. |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Verarbeitet den letzten Datenblock und berechnet den Ausgabewert. |
| virtual [~ToBase64Transform](./~tobase64transform/)() | Destruktor. |
## Siehe auch

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
