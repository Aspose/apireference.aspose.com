---
title: "System::Drawing::TextureBrush Klasse"
linktitle: "TextureBrush"
second_title: "Aspose.Font für C++"
description: "System::Drawing::TextureBrush Klasse. Stellt einen Pinsel dar, der ein Bild verwendet, um das Innere einer Form zu füllen. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2800
url: /de/cpp/system.drawing/texturebrush/
---
## TextureBrush class


Stellt einen Pinsel dar, der ein Bild verwendet, um das Innere einer Form zu füllen. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Erstellt eine Kopie des aktuellen Objekts. |
| [get_Image](./get_image/)() | Gibt ein Bild zurück, das vom aktuellen [TextureBrush](./)-Objekt verwendet wird. |
| [get_Transform](./get_transform/)() | Gibt eine Kopie eines Matrix‑Objekts zurück, das die geometrischen Transformationen für den vom aktuellen Objekt dargestellten Pinsel spezifiziert. |
| [get_WrapMode](./get_wrapmode/)() | Gibt einen Wert zurück, der angibt, wie der vom aktuellen Objekt dargestellte Pinsel gekachelt wird. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Multipliziert die Transformationsmatrix des aktuellen Objekts mit der angegebenen Matrix. |
| [ResetTransform](./resettransform/)() | Setzt die Transformationsmatrix des aktuellen Objekts zurück, sodass sie zur Einheitsmatrix wird. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Dreht die lokale geometrische Transformation um den angegebenen Winkel in der angegebenen Reihenfolge. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Skaliert die lokale geometrische Transformation um die angegebenen Faktoren in der angegebenen Reihenfolge. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | Setzt ein Matrix‑Objekt, das die geometrischen Transformationen für den vom aktuellen Objekt dargestellten Pinsel spezifiziert. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | Setzt einen Wert, der angibt, wie der vom aktuellen Objekt dargestellte Pinsel gekachelt wird. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | Erstellt eine neue Instanz der Klasse [TextureBrush](./), die das angegebene Bild verwendet. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | Erstellt eine neue Instanz der Klasse [TextureBrush](./), die das angegebene Bild verwendet. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | Erstellt eine neue Instanz der Klasse [TextureBrush](./), die das angegebene Bild verwendet. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | Erstellt eine neue Instanz der Klasse [TextureBrush](./), die das angegebene Bild verwendet. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | Erstellt eine neue Instanz der Klasse [TextureBrush](./), die das angegebene Bild verwendet. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Verschiebt die lokale geometrische Transformation um die angegebenen Abmessungen in der angegebenen Reihenfolge. |
| virtual [~TextureBrush](./~texturebrush/)() | Destruktor. |
## Siehe auch

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
