package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aw */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aw.class */
final class C1416aw extends Lambda implements Function1<EmMoc3Source, List<String>> {

    /* renamed from: a */
    public static final C1416aw f3590a = new C1416aw();


    C1416aw() {
        super();
    }

    /* renamed from: a */
    public List<String> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(5);
        return receiver.getEmModelSource().getEmParameterSources().getID();
    }
}
