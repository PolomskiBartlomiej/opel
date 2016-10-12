package pl.allegro.tech.opel;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class IdentifiersListNode implements OpelNode {
    private final List<OpelNode> identifiers;

    public IdentifiersListNode(List<OpelNode> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public CompletableFuture<?> getValue(EvalContext context) {
        throw new UnsupportedOperationException("Can't get value on ArgumentsListExpressionNode");
    }

    public static OpelNode empty() {
        return new IdentifiersListNode(Collections.emptyList());
    }

    public List<OpelNode> getIdentifiers() {
        return identifiers;
    }
}
