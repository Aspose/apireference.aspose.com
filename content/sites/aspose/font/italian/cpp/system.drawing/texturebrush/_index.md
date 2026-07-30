---
title: "Classe System::Drawing::TextureBrush"
linktitle: "TextureBrush"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::TextureBrush. Rappresenta un pennello che utilizza un'immagine per riempire l'interno di una forma. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2800
url: /it/cpp/system.drawing/texturebrush/
---
## TextureBrush class


Rappresenta un pennello che utilizza un'immagine per riempire l'interno di una forma. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Crea una copia dell'oggetto corrente. |
| [get_Image](./get_image/)() | Restituisce un'immagine utilizzata dall'oggetto [TextureBrush](./) corrente. |
| [get_Transform](./get_transform/)() | Restituisce una copia di un oggetto Matrix che specifica le trasformazioni geometriche per il pennello rappresentato dall'oggetto corrente. |
| [get_WrapMode](./get_wrapmode/)() | Restituisce un valore che specifica come il pennello rappresentato dall'oggetto corrente è piastrellato. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Moltiplica la matrice di trasformazione dell'oggetto corrente per la matrice specificata. |
| [ResetTransform](./resettransform/)() | Reimposta la matrice di trasformazione dell'oggetto corrente affinché diventi una matrice identità. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Ruota la trasformazione geometrica locale dell'angolo specificato nell'ordine specificato. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Scala la trasformazione geometrica locale dei fattori specificati nell'ordine specificato. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | Imposta un oggetto Matrix che specifica le trasformazioni geometriche per il pennello rappresentato dall'oggetto corrente. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | Imposta un valore che specifica come il pennello rappresentato dall'oggetto corrente è piastrellato. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | Crea una nuova istanza della classe [TextureBrush](./) che utilizza l'immagine specificata. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | Crea una nuova istanza della classe [TextureBrush](./) che utilizza l'immagine specificata. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | Crea una nuova istanza della classe [TextureBrush](./) che utilizza l'immagine specificata. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | Crea una nuova istanza della classe [TextureBrush](./) che utilizza l'immagine specificata. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | Crea una nuova istanza della classe [TextureBrush](./) che utilizza l'immagine specificata. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Trasla la trasformazione geometrica locale delle dimensioni specificate nell'ordine specificato. |
| virtual [~TextureBrush](./~texturebrush/)() | Distruttore. |
## Vedi anche

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
