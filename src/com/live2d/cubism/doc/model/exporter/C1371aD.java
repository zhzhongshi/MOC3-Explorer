package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.aD */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aD.class */
final class C1371aD extends Lambda implements Function1<EmMoc3Source, List<Integer>> {

    /* renamed from: a */
    public static final C1371aD f3545a = new C1371aD();


    C1371aD() {
        super();
    }

    /* renamed from: a */
    public List<Integer> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(5);
        return receiver.getEmModelSource().getEmParameterSources().getKeyformBindingSourcesBeginIndex();
    }
}
