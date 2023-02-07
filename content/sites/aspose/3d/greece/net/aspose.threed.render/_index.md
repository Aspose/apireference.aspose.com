---
title: Aspose.ThreeD.Render
second_title: Aspose.3D για Αναφορά API .NET
description: Όλες οι σχετικές κλάσεις απόδοσης ορίζονται σε αυτό το namespace
type: docs
weight: 70
url: /el/net/aspose.threed.render/
---
Όλες οι σχετικές κλάσεις απόδοσης ορίζονται σε αυτό το namespace

## Τάξεις

| Τάξη | Περιγραφή |
| --- | --- |
| [DescriptorSetUpdater](./descriptorsetupdater/) | Αυτή η κλάση επιτρέπει την ενημέρωση του[`IDescriptorSet`](../aspose.threed.render/idescriptorset/) σε λειτουργία αλυσίδας. |
| [DriverException](./driverexception/) | Η εξαίρεση που προκύπτει από τα προγράμματα οδήγησης εσωτερικής απόδοσης. |
| [EntityRenderer](./entityrenderer/) | Υποκατηγορία για την υλοποίηση απόδοσης για διαφορετικούς τύπους οντοτήτων. |
| [EntityRendererKey](./entityrendererkey/) | Το κλειδί της καταχωρημένης οντότητας renderer |
| [GLSLSource](./glslsource/) | Ο πηγαίος κώδικας των shader στο GLSL |
| [InitializationException](./initializationexception/) | Εξαιρέσεις στο render pipeline προετοιμασία |
| [PostProcessing](./postprocessing/) | Τα εφέ μετά την επεξεργασία |
| [PushConstant](./pushconstant/) | Ένα βοηθητικό πρόγραμμα για την παροχή δεδομένων σε shader μέσω σταθεράς ώθησης. |
| [Renderer](./renderer/) | Το πλαίσιο σχετικά με το renderer. |
| [RendererVariableManager](./renderervariablemanager/) | Αυτή η κλάση διαχειρίζεται τις μεταβλητές που χρησιμοποιούνται στο rendering |
| [RenderFactory](./renderfactory/) | Το Το RenderFactory δημιουργεί όλους τους πόρους που αντιπροσωπεύονται στη γραμμή απόδοσης. |
| [RenderParameters](./renderparameters/) | Περιγράψτε τις παραμέτρους της απόδοσης target |
| [RenderResource](./renderresource/) | Η αφηρημένη κλάση όλων των πόρων απόδοσης Όλοι οι πόροι απόδοσης θα διατεθούν όταν απελευθερωθεί η διάταξη απόδοσης. Τάξεις όπως[`Mesh`](../aspose.threed.entities/mesh/)/[`Texture`](../aspose.threed.shading/texture/) θα έχει ένα αντίστοιχο RenderResource |
| [RenderState](./renderstate/) | Κατάσταση απόδοσης για την κατασκευή του αγωγού Οι αλλαγές που έγιναν στην κατάσταση απόδοσης δεν θα επηρεάσουν τις δημιουργημένες παρουσίες του αγωγού. |
| [ShaderException](./shaderexception/) | Εξαιρέσεις που σχετίζονται με Shader |
| [ShaderProgram](./shaderprogram/) | Το πρόγραμμα shader |
| [ShaderSet](./shaderset/) | Προγράμματα Shader για κάθε είδος υλικών |
| [ShaderSource](./shadersource/) | Ο πηγαίος κώδικας του shader |
| [ShaderVariable](./shadervariable/) | Μεταβλητή Shader |
| [SPIRVSource](./spirvsource/) | Το μεταγλωττισμένο shader σε μορφή SPIR-V. |
| [StencilState](./stencilstate/) | Καταστάσεις στένσιλ ανά πρόσωπο. |
| [TextureData](./texturedata/) | Αυτή η κλάση περιέχει τα ακατέργαστα δεδομένα και τον ορισμό μορφής μιας υφής. |
| [Viewport](./viewport/) | Α[`IRenderTarget`](../aspose.threed.render/irendertarget/) περιέχει τουλάχιστον ένα παράθυρο προβολής για την απόδοση της σκηνής. |
| [WindowHandle](./windowhandle/) | Ενθυλακωμένη λαβή παραθύρου για διαφορετικές πλατφόρμες. |
## Δομές

| Δομή | Περιγραφή |
| --- | --- |
| [CubeFaceData&lt;T&gt;](./cubefacedata-1/) | Δεδομένα για κάθε όψη της υφής του χάρτη κύβου. |
## Διεπαφές

| Διεπαφή | Περιγραφή |
| --- | --- |
| [IBuffer](./ibuffer/) | Η βασική διεπαφή όλων των διαχειριζόμενων buffer που χρησιμοποιούνται στο rendering |
| [ICommandList](./icommandlist/) | Κωδικοποιεί μια ακολουθία εντολών που θα σταλούν στην GPU για απόδοση. |
| [IDescriptorSet](./idescriptorset/) | Τα σύνολα περιγραφέων περιγράφουν διαφορετικούς πόρους που μπορούν να χρησιμοποιηθούν για να συνδεθούν στη γραμμή απόδοσης όπως buffers, textures |
| [IIndexBuffer](./iindexbuffer/) | Η προσωρινή μνήμη ευρετηρίου περιγράφει τη γεωμετρία που χρησιμοποιείται στην απόδοση του αγωγού. |
| [IPipeline](./ipipeline/) | Η προ-ψημένη ακολουθία λειτουργιών για την κατάρτιση στην πλευρά της GPU. |
| [IRenderQueue](./irenderqueue/) | Το πρόγραμμα απόδοσης οντοτήτων χρησιμοποιεί αυτήν την ουρά για τη διαχείριση εργασιών απόδοσης. |
| [IRenderTarget](./irendertarget/) | Η βασική διεπαφή του render target |
| [IRenderTexture](./irendertexture/) | Η διεπαφή του render texture |
| [IRenderWindow](./irenderwindow/) | Το IRenderWindow αντιπροσωπεύει το εγγενές παράθυρο που δημιουργήθηκε από το λειτουργικό σύστημα που υποστηρίζει την απόδοση. |
| [ITexture1D](./itexture1d/) | υφή 1D |
| [ITexture2D](./itexture2d/) | υφή 2D |
| [ITextureCubemap](./itexturecubemap/) | Υφή χάρτη κύβου |
| [ITextureUnit](./itextureunit/) | [`ITextureUnit`](../aspose.threed.render/itextureunit/) αντιπροσωπεύει μια υφή στη μνήμη που μοιράζεται μεταξύ της GPU και της CPU και μπορεί να γίνει δειγματοληψία από το shader, όπου το[`Texture`](../aspose.threed.shading/texture/) αντιπροσωπεύει μόνο μια αναφορά σε ένα εξωτερικό αρχείο. Περισσότερες λεπτομέρειες μπορείτε να βρείτε https://en.wikipedia.org/wiki/Texture_mapping_unit |
| [IVertexBuffer](./ivertexbuffer/) | Το buffer κορυφής διατηρεί τα δεδομένα κορυφής πολυγώνου που θα σταλούν στην απόδοση pipeline |
## Απαρίθμηση

| Απαρίθμηση | Περιγραφή |
| --- | --- |
| [BlendFactor](./blendfactor/) | Συντελεστής ανάμειξης καθορίζει αριθμητική pixel. |
| [CompareFunction](./comparefunction/) | Η συνάρτηση σύγκρισης που χρησιμοποιείται στη δοκιμή βάθους/στένσιλ. |
| [CubeFace](./cubeface/) | Κάθε όψη της υφής του χάρτη κύβου |
| [CullFaceMode](./cullfacemode/) | Ποιο πρόσωπο για να συλλάβω |
| [DrawOperation](./drawoperation/) | Οι πρωτόγονοι τύποι για απόδοση |
| [EntityRendererFeatures](./entityrendererfeatures/) | Τα επιπλέον χαρακτηριστικά που θα παρέχει η απόδοση απόδοσης οντοτήτων |
| [FrontFace](./frontface/) | Ορισμός πολυγώνων με όψη μπροστά και πίσω |
| [IndexDataType](./indexdatatype/) | Ο τύπος δεδομένων των στοιχείων σε[`IIndexBuffer`](../aspose.threed.render/iindexbuffer/) |
| [PixelFormat](./pixelformat/) | Η μορφή του εικονοστοιχείου που χρησιμοποιείται στη μονάδα υφής. |
| [PolygonMode](./polygonmode/) | Η λειτουργία ραστεροποίησης πολυγώνου |
| [PresetShaders](./presetshaders/) | Αυτό καθορίζει τους προκαθορισμένους εσωτερικούς σκιαδόρους που χρησιμοποιούνται από τον renderer. |
| [RenderQueueGroupId](./renderqueuegroupid/) | Το αναγνωριστικό ομάδας της ουράς απόδοσης |
| [RenderStage](./renderstage/) | Το στάδιο απόδοσης |
| [ShaderStage](./shaderstage/) | Shader stage |
| [StencilAction](./stencilaction/) | The stencil test actions |
| [TextureType](./texturetype/) | Ο τύπος του[`ITextureUnit`](../aspose.threed.render/itextureunit/) |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
