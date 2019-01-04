package com.target.queuing;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

import com.target.model.Job;

public class FirstComeFirstServe implements QueuingAlgorithm {

	@Override
	public List<Job> getQueuingSequence(Queue<Job> queue) {
		return queue.stream().collect(Collectors.toCollection(ArrayList::new));
	}

}
